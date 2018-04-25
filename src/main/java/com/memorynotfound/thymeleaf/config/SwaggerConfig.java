package com.memorynotfound.thymeleaf.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * The Class SwaggerConfig.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.memorynotfound.thymeleaf.controller"))
                .paths(PathSelectors.ant("/plotly/*/**"))
                .build()
                .apiInfo(apiInfo());
        //				.useDefaultResponseMessages(false)
//				.globalResponseMessage(RequestMethod.GET,
//						new ArrayList(new ResponseMessageBuilder()
//										.code(500)
//										.message("500 message")
//										.responseModel(new ModelRef("Error"))
//										.build(),
//								new ResponseMessageBuilder()
//										.code(403)
//										.message("Forbidden!")
//										.build()));
    }

    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "Plotly.Toyhouse.cc REST API",
                "Plotly.Toyhouse.cc description of API.",
                "0.0.1",
                "Terms of service",
                "contact@toyhouse.cc",
                "License of API",
                "API license URL");
        return apiInfo;
    }


}