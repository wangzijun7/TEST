package com.bab.springboot.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Description:
 * @Author: Tu Xu
 * @CreateDate: 2019/12/4 9:46
 * @Version: 1.0
 **/
@Configuration
@ComponentScan("com.bab.springboot")
@EnableTransactionManagement
@MapperScan("com.bab.springboot.mapper")
public class SsmConfig {
}
