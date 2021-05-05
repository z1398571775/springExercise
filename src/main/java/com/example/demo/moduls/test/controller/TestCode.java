package com.example.demo.moduls.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestCode {
    @GetMapping("/test")
    public String testcoe(){
        System.out.println("123");
        return "123";
    }
}
