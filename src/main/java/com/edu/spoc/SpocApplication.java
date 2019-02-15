package com.edu.spoc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.edu.spoc.mapper")
@SpringBootApplication
public class SpocApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpocApplication.class, args);
    }
}

