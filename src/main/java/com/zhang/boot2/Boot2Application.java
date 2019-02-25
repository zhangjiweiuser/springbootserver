package com.zhang.boot2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zhang.boot2.dao")
public class Boot2Application {

    public static void main(String[] args) {
        SpringApplication.run(Boot2Application.class, args);
    }

}
