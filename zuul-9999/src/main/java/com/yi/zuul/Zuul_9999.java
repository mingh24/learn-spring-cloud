package com.yi.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Project Name: learn-spring-cloud
 * File Name: Zuul_9999
 * Package Name: com.yi.zuul
 *
 * @author yipple
 * @date 2020/5/27
 * @since 0.0.1
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuul_9999 {
    public static void main(String[] args) {
        SpringApplication.run(Zuul_9999.class, args);
    }
}
