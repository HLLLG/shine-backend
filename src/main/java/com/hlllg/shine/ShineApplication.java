package com.hlllg.shine;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.hlllg.shine.mapper")
@EnableScheduling
public class ShineApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShineApplication.class, args);
    }

}
