package com.example.CICDdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    // test controller for testing
    @GetMapping("/test")
    public String test(){
        return "Welcome to CI/CD";
    }
}
