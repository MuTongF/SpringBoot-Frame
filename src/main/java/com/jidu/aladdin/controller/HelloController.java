package com.jidu.aladdin.controller;

import com.jidu.aladdin.entity.admin.AdminDemo;
import com.jidu.aladdin.service.admin.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private AdminService adminService;

    @RequestMapping("hello")
    public String hello(){
        return "Hello Spring!";
    }
    @RequestMapping("demo")
    public List<AdminDemo> demo(){
        return adminService.getAllAdminList();
    }
}
