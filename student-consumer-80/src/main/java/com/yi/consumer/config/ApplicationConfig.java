package com.yi.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Project Name: learn-spring-cloud
 * File Name: ApplicationConfig
 * Package Name: com.yi.consumer.config
 *
 * @author yipple
 * @date 2020/5/27
 * @since 0.0.1
 */
@Configuration
public class ApplicationConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
