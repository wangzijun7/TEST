package com.bab.springboot.app;


import com.bab.springboot.config.ShiroConfig;
import com.bab.springboot.config.SpringCacheConfig;
import com.bab.springboot.config.SsmConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
springboot整合springmvc mybatis  redis spring-session spring-cache
 **/
@SpringBootApplication
@Import({SsmConfig.class, SpringCacheConfig.class, ShiroConfig.class})
public class SpringBootApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApp.class,args);
    }
}
