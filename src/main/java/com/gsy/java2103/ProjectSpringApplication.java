package com.gsy.java2103;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.gsy.java2103.mapper"})
public class ProjectSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectSpringApplication.class, args);
    }

}
