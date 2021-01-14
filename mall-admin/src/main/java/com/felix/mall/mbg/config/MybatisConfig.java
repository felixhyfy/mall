package com.felix.mall.mbg.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Felix
 * @packageName com.felix.mall.mbg.config
 * @className MybatisConfig Mybatis配置类
 * @description
 * @date 2021/1/9 21:40
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.felix.mall.mbg.mapper", "com.felix.mall.dao"})
public class MybatisConfig {

}
