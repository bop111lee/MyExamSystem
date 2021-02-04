package com.exam.System;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
//@EnableConfigurationProperties(value = { SystemConfig.class})
@EnableCaching
public class SystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(SystemApplication.class, args);
    }
}
