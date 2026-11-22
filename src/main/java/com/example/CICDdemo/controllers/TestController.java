package com.example.CICDdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    // test controller for testing
    @GetMapping("/test")
    public String test(){
        return "Welcome to CI/CD, version 10-STABLE";
    }

    @GetMapping("/welcome")
    public String welcome(@RequestParam String username, @RequestParam String message){
        return  "Welcome "+username+ " you got a message "+message;
    }
}
