package com.example.todolist_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.todolist_demo.dao")
@SpringBootApplication
public class TodolistDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodolistDemoApplication.class, args);
    }

}
