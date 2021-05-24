package com.example.demo.moduls.Systerm.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
@Api("用户登录控制")
public class SystemUserController {
    @RequestMapping("/goLogin")
    public String turnLogin(){
        return "login";
    }
}
