package com.li.springcloud.dao;

import com.li.springcloud.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StudentMapper {

    @Select("select * from student")
    List<Student> getSts();
}
