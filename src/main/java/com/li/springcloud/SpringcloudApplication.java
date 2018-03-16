package com.li.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.li")
public class SpringcloudApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringcloudApplication.class, args);
    }
}
