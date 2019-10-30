package com.mutong.controller;

import com.mutong.common.LayuiJson;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class LoginController {
    @PostMapping("login")
    public LayuiJson login(HttpSession session){
        session.setAttribute("admin","测试");
        return LayuiJson.newInstance("登陆成功");
    }
}
