package com.dell.swagger.controller;

import com.dell.swagger.entitie.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class sayController {
    @RequestMapping(value = {"/hello"})
    public String hello(){
        return "hello";
    }
    @ApiOperation("Swagger测试控制类")
    @GetMapping(value = {"/user"})
    public String getUser(){
        return "这是一个get请求"+"123456";
    }
    @ApiOperation("尝试post方法传参")
    @PostMapping(value = {"/senduUer"})
    public String sendUser(User user){
        return "参数进来了";
    }
    @PostMapping(value = {"/senduUer2"})
    public String sendUser2(User user){
        return "参数进来了";
    }
    @PostMapping(value = {"/senduUer3"})
    public String sendUser3(User user){
        return "参数进来了";
    }

}
