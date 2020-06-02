package com.yi.api.service;

import com.yi.api.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * Project Name: learn-spring-cloud
 * File Name: StudentClientService
 * Package Name: com.yi.api.service
 *
 * @author yipple
 * @date 2020/6/2
 * @since 0.0.1
 */
@FeignClient("student-producer")
public interface StudentClientService {

    @PostMapping("/student/add")
    public boolean addStudent(Student student);

    @GetMapping("/student/query/{id}")
    public Student queryStudentById(@PathVariable("id") Integer id);

    @GetMapping("/student/list")
    public List<Student> queryAllStudents();

}
