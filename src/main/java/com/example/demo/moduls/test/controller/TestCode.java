package com.example.demo.moduls.test.controller;

import com.example.demo.moduls.Systerm.entity.Result;
import com.example.demo.moduls.Systerm.entity.SystemUser;
import com.example.demo.moduls.redis.service.RedisService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Api("测试")
public class TestCode {
    @Autowired
    RedisService redisService;
    @GetMapping("/test")
    @ApiOperation(value = "测试方法")
    public Result<SystemUser> testcoe(@RequestBody(required = false) @ApiParam(name = "用户对象",value = "测试",required = false) SystemUser user){
        System.out.println("123");
        Result<SystemUser> result = new Result<>();
        redisService.addString("test","123");
        return result;
    }
}
