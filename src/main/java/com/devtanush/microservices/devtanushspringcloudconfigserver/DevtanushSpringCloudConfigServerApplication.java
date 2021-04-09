package com.devtanush.microservices.devtanushspringcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DevtanushSpringCloudConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevtanushSpringCloudConfigServerApplication.class, args);
    }

}
