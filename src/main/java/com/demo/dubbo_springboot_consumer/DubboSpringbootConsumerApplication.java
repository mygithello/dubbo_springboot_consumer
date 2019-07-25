package com.demo.dubbo_springboot_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.demo.dubbo_springboot_consumer.controller")
public class DubboSpringbootConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboSpringbootConsumerApplication.class, args);
    }

}
