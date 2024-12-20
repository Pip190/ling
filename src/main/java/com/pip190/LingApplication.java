package com.pip190;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.pip190.mapper")
public class LingApplication {

    public static void main(String[] args) {
        SpringApplication.run(LingApplication.class, args);
    }

}