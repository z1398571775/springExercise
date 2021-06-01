package com.example.demo.moduls.Systerm.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
@Api("用户登录控制")
public class SystemUserController {
    @RequestMapping("/goLogin")
    @ApiOperation(value = "跳转到登录页面")
    public String turnLogin(){
        return "login";
    }
}
