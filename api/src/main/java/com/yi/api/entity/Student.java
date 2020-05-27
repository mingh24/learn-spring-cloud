package com.yi.api.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Project Name: learn-spring-cloud
 * File Name: Student
 * Package Name: com.yi.api.entity
 *
 * @author yipple
 * @date 2020/5/27
 * @since 0.0.1
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Student implements Serializable {

    private Integer id;

    private String name;

    private String sex;

}
