package com.example.demo.modules.test.controller;

import com.example.demo.modules.test.entity.Usertable;
import com.example.demo.modules.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    TestService testService;

    @RequestMapping("/get")
    public void getData(){
        Usertable usertable = testService.getData("1");
        System.out.println(usertable);
    }
}
