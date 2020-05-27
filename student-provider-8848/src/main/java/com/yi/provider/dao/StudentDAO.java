package com.yi.provider.dao;

import com.yi.api.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Project Name: learn-spring-cloud
 * File Name: StudentDAO
 * Package Name: com.yi.provider.dao
 *
 * @author yipple
 * @date 2020/5/27
 * @since 0.0.1
 */
@Mapper
@Repository
public interface StudentDAO {

    public boolean addStudent(Student student);

    public Student queryStudentById(Integer id);

    public List<Student> queryAllStudents();

}
