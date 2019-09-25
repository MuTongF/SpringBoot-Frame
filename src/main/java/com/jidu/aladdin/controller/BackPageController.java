package com.jidu.aladdin.controller;

import com.jidu.aladdin.common.PageResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 后台页面的控制层
 */
@Controller
@RequestMapping("/back")
public class BackPageController {
    @ApiOperation("跳转到首页")
    @GetMapping("index")
    public String index(){
        return "index";
    }
}
