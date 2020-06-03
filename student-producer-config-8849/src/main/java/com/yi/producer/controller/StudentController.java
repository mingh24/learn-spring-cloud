package com.yi.producer.controller;

import com.yi.api.entity.Student;
import com.yi.producer.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Project Name: learn-spring-cloud
 * File Name: StudentController
 * Package Name: com.yi.producer.controller
 *
 * @author yipple
 * @date 2020/5/27
 * @since 0.0.1
 */
@RestController
@RequestMapping(produces = "application/json; charset=utf-8")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/student/add")
    public boolean addStudent(Student student) {
        return studentService.addStudent(student);
    }

    @GetMapping("/student/query/{id}")
    public Student queryStudentById(@PathVariable("id") Integer id) {
        return studentService.queryStudentById(id);
    }

    @GetMapping("/student/list")
    public List<Student> queryAllStudents() {
        return studentService.queryAllStudents();
    }

    @GetMapping("/api/v1/producer/demo/get")
    public String test() {
        return "This is producer.";
    }

}
