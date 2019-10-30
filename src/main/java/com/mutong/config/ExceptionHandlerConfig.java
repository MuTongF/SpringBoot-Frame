package com.mutong.config;

import com.mutong.common.LayuiJson;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 统一异常处理类
 */
@ControllerAdvice
public class ExceptionHandlerConfig {

	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public LayuiJson error(HttpServletResponse httpServletResponse, Exception e) throws IOException, ServletException {
		e.printStackTrace();
		System.out.println("出错信息：" + e.getMessage());
		return LayuiJson.newErrorInstance(9001,"系统繁忙",e.getMessage());
	}
}
