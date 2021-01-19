package com.felix.mall.security.config;

import com.felix.mall.dto.AdminUserDetailsDTO;
import com.felix.mall.mbg.entity.UmsAdmin;
import com.felix.mall.mbg.entity.UmsPermission;
import com.felix.mall.security.component.JwtAuthenticationTokenFilter;
import com.felix.mall.security.component.RestAuthenticationEntryPoint;
import com.felix.mall.security.component.RestfulAccessDeniedHandler;
import com.felix.mall.service.UmsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import java.util.List;

/**
 * @author Felix
 * @packageName com.felix.mall.security.config
 * @className SecurityConfig
 * @description Spring Security 配置类，该类需要继承WebSecurityConfigurerAdapter
 * @date 2021/1/10 13:12
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UmsAdminService adminService;

    /**
     * 当用户没有访问权限时的处理器
     */
    @Autowired
    private RestfulAccessDeniedHandler restfulAccessDeniedHandler;

    /**
     * 当未登录或者token失效时，返回JSON格式的结果
     */
    @Autowired
    private RestAuthenticationEntryPoint restAuthenticationEntryPoint;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //由于使用的是JWT，我们这里不需要csrf
        http.csrf()
                .disable()
                .sessionManagement() //基于token，所以不需要session
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authorizeRequests()
                //允许对于网站静态资源的无授权访问
                .antMatchers(HttpMethod.GET,
                        "/",
                        "/*.html",
                        "/favicon.ico",
                        "/**/*.html",
                        "/**/*.css",
                        "/**/*.js",
                        "/swagger-resources/**",
                        "/v2/api-docs/**"
                )
                .permitAll()
                //对于登录注册要允许匿名访问
                .antMatchers("/admin/login", "/admin/register")
                .permitAll()
                //跨域请求会先进行一次options请求
                .antMatchers(HttpMethod.OPTIONS)
                .permitAll()
                //测试时全部允许访问
                //.antMatchers("/**")
                //.permitAll()
                //除了上面外的所有请求，全部需要鉴权认证
                .anyRequest()
                .authenticated();

        //禁用缓存
        http.headers().cacheControl();
        //添加JWT Filter
        http.addFilterBefore(jwtAuthenticationTokenFilter(), UsernamePasswordAuthenticationFilter.class);
        //添加自定义未授权和未登录结果返回
        http.exceptionHandling()
                .accessDeniedHandler(restfulAccessDeniedHandler)
                .authenticationEntryPoint(restAuthenticationEntryPoint);
    }

    /**
     * 登录验证并将密码加密
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService())
                .passwordEncoder(passwordEncoder());
    }

    /**
     * 自定义UserDetailService 获取登录用户信息
     * @return
     */
    @Bean
    @Override
    public UserDetailsService userDetailsService() {
        //获取登录用户信息
        return username -> {
            UmsAdmin admin = adminService.getAdminByUsername(username);
            if (null != admin) {
                //登录成功
                //获取当前用户的permissionList
                List<UmsPermission> permissionList = adminService.getPermissionList(admin.getId());
                //将admin和permissionList封装成DTO返回
                return new AdminUserDetailsDTO(admin, permissionList);
            }
            //登录失败
            throw new UsernameNotFoundException("用户名或密码错误");
        };
    }

    /**
     * 获得BCryptPasswordEncoder 密码编码类
     * @return
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    /**
     * 获得自定义的JwtAuthenticationTokenFilter JWT登录授权过滤器
     * @return
     */
    @Bean
    public JwtAuthenticationTokenFilter jwtAuthenticationTokenFilter() {
        return new JwtAuthenticationTokenFilter();
    }

}
