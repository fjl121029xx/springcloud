package com.li.springcloud.controller;

import com.li.springcloud.dao.StudentMapper;
import com.li.springcloud.entity.Student;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private RestTemplateBuilder builder;

    @Autowired
    @Qualifier("eurekaClient")
    private EurekaClient eurekaClient;

//    @Autowired
//    private DiscoveryClient discoveryClient;

    // 使用RestTemplateBuilder来实例化RestTemplate对象，spring默认已经注入了RestTemplateBuilder实例
    @Bean
    public RestTemplate restTemplate() {
        return builder.build();
    }

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private StudentMapper studentMapper;

    @GetMapping("/student/lists")
    @ResponseBody
    public Object lists() {

        List<Student> sts = studentMapper.getSts();

        return sts;
    }

    @GetMapping("/eureka-instance")
    @ResponseBody
    public String serviceUrl() {

        InstanceInfo stores = eurekaClient.getNextServerFromEureka("STUDENT-SERVER", false);
        return stores.getHomePageUrl();
    }

    @GetMapping("/eureka-instance-info")
    @ResponseBody
    public String shouInfo() {
        //本来要写discoverclient

        return "";
    }
}
