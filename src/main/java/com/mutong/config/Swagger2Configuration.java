package com.mutong.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//
@Configuration
@EnableSwagger2
public class Swagger2Configuration {

    //是否开启swagger，正式环境一般是需要关闭的，可根据Springboot的多环境配置进行设置
    @Value(value = "${swagger.enabled}")
    private boolean swaggerEnabled;

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(swaggerEnabled)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.mutong"))//扫描Controller
                .paths(PathSelectors.any())
                .build().pathMapping("/");
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Swagger2的Api文档")
                .description("api文档")
                .version("1.0.0")
                .build();
    }

}
