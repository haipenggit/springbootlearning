package com.haipeng.springinitializer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("/world")
    public String helloWorld() {
        System.out.println("HelloWorld");
        return "HelloWorld";
    }
}
