package com.jn.controller;


import com.jn.service.SayHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {

    @Autowired
    SayHello service;

    @GetMapping("/hello")
    public String hello() {
        service.sayHello();
        return "Success!";
    }
}


