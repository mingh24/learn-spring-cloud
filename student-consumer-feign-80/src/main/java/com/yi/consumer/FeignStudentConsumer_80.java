package com.yi.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Project Name: learn-spring-cloud
 * File Name: FeignStudentConsumer_80
 * Package Name: com.yi.consumer
 *
 * @author yipple
 * @date 2020/5/27
 * @since 0.0.1
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.yi.api.service"})
public class FeignStudentConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(FeignStudentConsumer_80.class, args);
    }
}
