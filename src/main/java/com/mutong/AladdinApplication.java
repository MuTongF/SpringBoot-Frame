package com.mutong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.mutong.dao")//扫描mapper层
@EnableScheduling //启动定时器
public class AladdinApplication {

    public static void main(String[] args) {
        SpringApplication.run(AladdinApplication.class, args);
    }

}
