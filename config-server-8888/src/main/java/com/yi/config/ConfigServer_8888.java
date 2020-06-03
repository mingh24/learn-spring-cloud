package com.yi.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Project Name: learn-spring-cloud
 * File Name: ConfigServer_8888
 * Package Name: com.yi.config
 *
 * @author yipple
 * @date 2020/5/27
 * @since 0.0.1
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServer_8888 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer_8888.class, args);
    }
}
