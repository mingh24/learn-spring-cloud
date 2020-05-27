package com.yi.consumer.controller;

import com.yi.api.entity.Student;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

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

    private static final String REST_URL_PREFIX = "http://localhost:8848";

    private final RestTemplate restTemplate;

    public StudentConsumerController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @PostMapping("/consumer/student/add")
    public boolean addStudent(Student student) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/student/add", student, Boolean.class);
    }

    @GetMapping("/consumer/student/query/{id}")
    public Student queryStudentById(@PathVariable("id") Integer id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/student/query/" + id, Student.class);
    }

    @GetMapping("/consumer/student/list")
    public List<Student> queryAllStudents() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/student/list", List.class);
    }

    @GetMapping("/api/v1/demo/get")
    public String test() {
        String fromProducer = restTemplate.getForObject(REST_URL_PREFIX + "/api/v1/producer/demo/get", String.class);
        return "This is consumer.\n" + fromProducer;
    }

}
