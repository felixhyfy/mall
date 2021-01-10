package com.felix.mall.security.config;

import com.felix.mall.security.component.RestAuthenticationEntryPoint;
import com.felix.mall.security.component.RestfulAccessDeniedHandler;
import com.felix.mall.service.UmsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

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



}
