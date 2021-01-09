package com.felix.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Felix
 * @packageName com.felix.mall.config
 * @className MybatisConfig Mybatis配置类
 * @description
 * @date 2021/1/9 21:40
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.felix.mall.mapper", "com.felix.mall.dao"})
public class MybatisConfig {

}
