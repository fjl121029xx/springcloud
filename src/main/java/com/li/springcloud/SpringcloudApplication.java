package com.li.springcloud;

import com.li.springcloud.dao.StudentMapper;
import com.li.springcloud.entity.Student;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
@MapperScan("com.li")
/**
 * @author li
 */
@EnableEurekaClient
public class SpringcloudApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringcloudApplication.class, args);
    }
}
