package com.yi.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project Name: learn-spring-cloud
 * File Name: ConfigClientController
 * Package Name: com.yi.config.controller
 *
 * @author yipple
 * @date 2020/6/3
 * @since 0.0.1
 */
@RestController
public class ConfigClientController {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServer;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/config")
    public String getConfig() {
        return "applicationName: " + applicationName
                + "\neurekaServer: " + eurekaServer
                + "\nport: " + port;
    }

}
