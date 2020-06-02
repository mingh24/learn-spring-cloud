package com.yi.producer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yi.api.entity.Student;
import com.yi.producer.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
    @HystrixCommand(fallbackMethod = "hystrixAddStudent")
    public boolean addStudent(Student student) {
        Student originalStudent = studentService.queryStudentById(student.getId());

        if (originalStudent != null) {
            throw new RuntimeException("已存在学号为 " + student.getId() + " 的学生");
        }

        return studentService.addStudent(student);
    }

    public boolean hystrixAddStudent(Student student) {
        return false;
    }

    @GetMapping("/student/query/{id}")
    @HystrixCommand(fallbackMethod = "hystrixQueryStudentById")
    public Student queryStudentById(@PathVariable("id") Integer id) {
        Student student = studentService.queryStudentById(id);

        if (student == null) {
            throw new RuntimeException("不存在学号为 " + id + " 的学生");
        }

        return student;
    }

    public Student hystrixQueryStudentById(Integer id) {
        return new Student().setId(id).setName("@hystrixQueryStudentById 不存在学号为 " + id + " 的学生");
    }

    @GetMapping("/student/list")
    @HystrixCommand(fallbackMethod = "hystrixQueryAllStudents")
    public List<Student> queryAllStudents() {
        List<Student> studentList = studentService.queryAllStudents();

        if (studentList == null) {
            throw new RuntimeException("查询学生列表时出现异常");
        }

        return studentList;
    }

    public List<Student> hystrixQueryAllStudents() {
        return new ArrayList<>();
    }

    @GetMapping("/api/v1/producer/demo/get")
    public String test() {
        return "This is producer.";
    }

}
