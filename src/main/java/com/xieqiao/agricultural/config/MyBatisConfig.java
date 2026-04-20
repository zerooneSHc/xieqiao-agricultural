package com.xieqiao.agricultural.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.xieqiao.agricultural.dao")
public class MyBatisConfig {
}