package com.example.todolist_demo;

import com.example.todolist_demo.dao.TodolistDao;
import com.example.todolist_demo.entity.Todolist;
import com.example.todolist_demo.service.TodoService;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.awt.*;

@SpringBootTest
class TodolistDemoApplicationTests {

    private TodoService todoService;
    @Test
    void contextLoads() {

    }

//    @Test
//    public void testGetlist(){
//        System.out.println(todoService.getTodolist());
//    }

}
