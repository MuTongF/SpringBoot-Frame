package com.mutong.config;

import com.mutong.interceptor.SessionInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
/**
 * 1.   配置静态资源访问路径
 * 2.   配置拦截器
 */
public class MyWebConfigurer implements WebMvcConfigurer {
    @Autowired
    private SessionInterceptor sessionInterceptor;


    // 这个方法是用来配置静态资源的，比如html，js，css，等等
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/static/");
        // 放掉swagger-ui.html,部署了项目名后访问不到的bug
        registry.addResourceHandler("swagger-ui.html").addResourceLocations(
                "classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations(
                "classpath:/META-INF/resources/webjars/");
        //配置图片访问路径
        registry.addResourceHandler("/image/**").addResourceLocations("file:/C:/upload/image/");

    }


    // 这个方法用来注册拦截器，我们自己写好的拦截器需要通过这里添加注册才能生效
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        /**
         *  注册拦截器
         *  addPathPatterns:>:拦截的路径
         *  excludePathPatterns:>:取消拦截的路径
         */
        registry.addInterceptor(sessionInterceptor)
                .addPathPatterns("/back/**")
                .excludePathPatterns(
                        "/back/login"
                );
    }
}
