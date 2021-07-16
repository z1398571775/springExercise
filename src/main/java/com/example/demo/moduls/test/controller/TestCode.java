package com.example.demo.moduls.test.controller;

import com.example.demo.moduls.Systerm.entity.Result;
import com.example.demo.moduls.Systerm.entity.SystemUser;
import com.example.demo.moduls.redis.service.RedisService;
import com.example.demo.moduls.test.mapper.TestMaper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.http.HttpHost;
import org.elasticsearch.client.Request;
import org.elasticsearch.client.Response;
import org.elasticsearch.client.RestClient;
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
    @Autowired
    TestMaper testMaper;
    @GetMapping("/test")
    @ApiOperation(value = "测试方法")
    public Result<SystemUser> testcoe(@RequestBody(required = false) @ApiParam(name = "用户对象",value = "测试",required = false) SystemUser user){
        System.out.println("123");
        Result<SystemUser> result = new Result<>();
        redisService.addString("test","123");
        return result;
    }


    @GetMapping("/search")
    @ApiOperation(value = "测试搜索")
    public Result<SystemUser> search(@RequestBody(required = false) @ApiParam(name = "用户对象",value = "测试",required = false) SystemUser user){
        System.out.println("123");
        Result<SystemUser> result = new Result<>();
        RestClient restClient = RestClient.builder(
                new HttpHost("127.0.0.1", 9200, "http"),
                new HttpHost("localhost", 9201, "http")).build();
        try{
        Request request = new Request(
                "GET",
                "/");
        Response response = restClient.performRequest(request);
        System.out.println(response);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

}
