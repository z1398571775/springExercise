package com.example.demo.modules.shiro.controller;

import com.example.demo.modules.shiro.entity.SystemUser;
import com.example.demo.modules.shiro.service.SystemUserService;
import com.example.demo.modules.system.entity.Result;
import com.hazelcast.internal.json.JsonObject;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shiro")
public class shiroController {
    @Autowired
    SystemUserService userService;
    @RequestMapping("/login")
    public Result<JsonObject> doLogin(@RequestBody SystemUser user){
        Result<JsonObject> result = new Result<>();
        result.setSuccess(userService.deLogin(user.getName(),user.getPassword()));
        return result;
    }
}
