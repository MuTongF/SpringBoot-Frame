package com.jidu.aladdin.controller;

import com.jidu.aladdin.entity.admin.AdminDemo;
import com.jidu.aladdin.service.admin.AdminService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private AdminService adminService;

    @ApiOperation("Hello Swagger!")//api文档注释
    @RequestMapping(value = "/hello",method = RequestMethod.POST)//等价于@PostMapping("/hello")
    public String hello(){
        return "Hello Spring!";
    }


    @ApiOperation("这是一个demo")
    @PostMapping("/demo")
    public List<AdminDemo> demo(){
        return adminService.getAllAdminList();
    }
}
