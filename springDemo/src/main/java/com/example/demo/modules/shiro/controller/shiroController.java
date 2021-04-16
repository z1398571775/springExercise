package com.example.demo.modules.shiro.controller;

import com.example.demo.modules.system.entity.Result;
import com.hazelcast.internal.json.JsonObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shiro")
public class shiroController {
    @PostMapping("/login")
    public Result<JsonObject> doLogin(String username,String password){

        return null;
    }
}
