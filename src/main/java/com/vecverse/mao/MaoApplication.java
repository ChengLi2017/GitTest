package com.vecverse.mao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.vecverse.mao")
public class MaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MaoApplication.class, args);
    }

}
