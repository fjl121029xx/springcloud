package com.li.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author li
 */
@SpringBootApplication
@MapperScan("com.li")
@EnableEurekaClient
public class SpringcloudApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringcloudApplication.class, args);
    }
}
