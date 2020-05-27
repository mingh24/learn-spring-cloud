package com.yi.provider.service;

import com.yi.api.entity.Student;
import com.yi.provider.dao.StudentDAO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Project Name: learn-spring-cloud
 * File Name: StudentService
 * Package Name: com.yi.provider.service
 *
 * @author yipple
 * @date 2020/5/27
 * @since 0.0.1
 */
@Service
public class StudentService implements StudentServiceInterface {

    private final StudentDAO studentDAO;

    public StudentService(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }


    @Override
    public boolean addStudent(Student student) {
        return studentDAO.addStudent(student);
    }

    @Override
    public Student queryStudentById(Integer id) {
        return studentDAO.queryStudentById(id);
    }

    @Override
    public List<Student> queryAllStudents() {
        return studentDAO.queryAllStudents();
    }

}
