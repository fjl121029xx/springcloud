package com.li.springcloud.controller;

import com.li.springcloud.dao.StudentMapper;
import com.li.springcloud.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class StudentController {

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

}
