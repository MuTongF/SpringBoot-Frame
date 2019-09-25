package com.jidu.aladdin.controller.user;

import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController("user")
public class UserController {

    @ApiOperation("后台获取用户分页信息")
    @PostMapping("/getUsersPage")
    public void getUsersPage(){

    }
}
