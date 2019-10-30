package com.mutong.controller;

import com.mutong.common.PageResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @ApiOperation("Hello Swagger!")//api文档注释
    @RequestMapping(value = "/hello",method = RequestMethod.POST)//等价于@PostMapping("/hello")
    public String hello(){
        return "Hello Spring!";
    }


    @ApiOperation("这是一个demo")
    @PostMapping("/demo")
    public PageResult demo(PageResult pageResult){
        return null;
    }
}
