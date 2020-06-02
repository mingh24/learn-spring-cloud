package com.yi.producer.service;

import com.yi.api.entity.Student;

import java.util.List;

/**
 * Project Name: learn-spring-cloud
 * File Name: StudentServiceInterface
 * Package Name: com.yi.producer.service
 *
 * @author yipple
 * @date 2020/5/27
 * @since 0.0.1
 */
public interface StudentServiceInterface {

    public boolean addStudent(Student student);

    public Student queryStudentById(Integer id);

    public List<Student> queryAllStudents();

}
