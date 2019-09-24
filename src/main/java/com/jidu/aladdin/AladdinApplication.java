package com.jidu.aladdin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jidu.aladdin.dao")
public class AladdinApplication {

    public static void main(String[] args) {
        SpringApplication.run(AladdinApplication.class, args);
    }

}
