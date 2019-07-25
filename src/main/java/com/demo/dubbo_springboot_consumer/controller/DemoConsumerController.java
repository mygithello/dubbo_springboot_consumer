package com.demo.dubbo_springboot_consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.demo.dubbo_springboot_provider.remote.DemoReService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoConsumerController {

    @Reference(version = "1.0.0",
            application = "${dubbo.application.id}",
            registry = "${dubbo.registry.id}")
    private DemoReService demoReService;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        return demoReService.sayHello(name);
    }

}
