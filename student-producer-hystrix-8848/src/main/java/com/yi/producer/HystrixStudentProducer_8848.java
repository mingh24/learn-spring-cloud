package com.yi.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * Project Name: learn-spring-cloud
 * File Name: HystrixStudentProducer_8848
 * Package Name: com.yi.producer
 *
 * @author yipple
 * @date 2020/5/27
 * @since 0.0.1
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class HystrixStudentProducer_8848 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixStudentProducer_8848.class, args);
    }
}
