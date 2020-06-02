package com.yi.consumer.controller;

import com.yi.api.entity.Student;
import com.yi.api.service.StudentClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Project Name: learn-spring-cloud
 * File Name: StudentConsumerController
 * Package Name: com.yi.consumer.controller
 *
 * @author yipple
 * @date 2020/5/27
 * @since 0.0.1
 */
@RestController
@RequestMapping(produces = "application/json; charset=utf-8")
public class StudentConsumerController {

    private final StudentClientService studentClientService;

    public StudentConsumerController(StudentClientService studentClientService) {
        this.studentClientService = studentClientService;
    }

    @PostMapping("/consumer/student/add")
    public boolean addStudent(Student student) {
        return studentClientService.addStudent(student);
    }

    @GetMapping("/consumer/student/query/{id}")
    public Student queryStudentById(@PathVariable("id") Integer id) {
        return studentClientService.queryStudentById(id);
    }

    @GetMapping("/consumer/student/list")
    public List<Student> queryAllStudents() {
        return studentClientService.queryAllStudents();
    } 

}
