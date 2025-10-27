package com.example.Falculty_Research_Management_System;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping("/")
    public String sayHello() {
        return "Hello World!";
    }
}
