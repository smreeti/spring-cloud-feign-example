package com.smriti.fiegnclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FiegnClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(FiegnClientApplication.class, args);
    }

}
