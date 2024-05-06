package com.cyq.mall_learning.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 */
@Configuration
@MapperScan("com.cyq.mall_learning.mbg.mapper")
public class MyBatisConfig {
}

