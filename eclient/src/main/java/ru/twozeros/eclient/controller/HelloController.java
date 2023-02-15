package ru.twozeros.eclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class HelloController {
    @Value("${eureka.instance.instance-id}")
    private String id;

    @GetMapping("/hello")
    public String sayHello() {
        return "hello world";
    }
    @GetMapping("/instance")
    public String getInstance() {
        return "instance: " + id;
    }

}
