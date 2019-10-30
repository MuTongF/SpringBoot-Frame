package com.mutong.config;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 分页插件配置
 */
@Configuration
public class PageHelperConfig {
    @Bean
    public PageHelper createPageHelper(){
        PageHelper pageHelper=new PageHelper();
        return pageHelper;
    }
}
