package com.example.groupsdashboard2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class GroupsDashboard2Application {

    public static void main(String[] args) {
        SpringApplication.run(GroupsDashboard2Application.class, args);
    }

}
