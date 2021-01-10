package com.felix.mall.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author Felix
 * @packageName com.felix.mall.security.config
 * @className SecurityConfig
 * @description Spring Security 配置类，该类需要继承WebSecurityConfigurerAdapter
 * @date 2021/1/10 13:12
 */
@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {


}
