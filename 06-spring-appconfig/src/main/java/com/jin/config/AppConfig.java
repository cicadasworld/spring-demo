package com.jin.config;

import com.jin.pojo.User;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.jin")
public class AppConfig {

    @Bean
    public User user() {
        return new User();
    }
}
