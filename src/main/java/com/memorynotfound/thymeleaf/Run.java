package com.memorynotfound.thymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class Run {

    public static void main(String... args) throws Exception {
        SpringApplication.run(Run.class, args);
    }

}
