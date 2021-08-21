package com.example.todolist_demo.controller;


import com.example.todolist_demo.entity.Todolist;
import com.example.todolist_demo.service.TodoService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/todolist")
@ComponentScan({"com.example.todolist_demo.service"})
@MapperScan("com.example.todolist_demo.dao")
public class TodoController {
    @Autowired
    private TodoService todoService;

    @GetMapping("/createtodolist/{content}")
    public void create(String content){
        todoService.createTodo(content);
    }
    @GetMapping("/updatecontent/{id}/{content}")
    public void updatec(Integer id,String content){
        todoService.updateContent(id,content);
    }
    @GetMapping("/updatestatus/{id}")
    public void updates(Integer id){
        todoService.updateStatus(id);
    }
    @GetMapping("/getalllist")
    public List<Todolist> get(){
        return todoService.getTodolist();
    }
    @GetMapping("deletetodolist/{id}")
    public void delete(Integer id){
        todoService.deleteTodo(id);
    }
}
