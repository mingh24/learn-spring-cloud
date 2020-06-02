package com.yi.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Project Name: learn-spring-cloud
 * File Name: StudentProducer_8849
 * Package Name: com.yi.producer
 *
 * @author yipple
 * @date 2020/5/27
 * @since 0.0.1
 */
@SpringBootApplication
@EnableEurekaClient
public class StudentProducer_8849 {
    public static void main(String[] args) {
        SpringApplication.run(StudentProducer_8849.class, args);
    }
}
