package com.example.todolist_demo.controller;


import com.example.todolist_demo.entity.Todolist;
import com.example.todolist_demo.service.TodoService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/todolist")
@ComponentScan({"com.example.todolist_demo.service"})
@MapperScan("com.example.todolist_demo.dao")
public class TodoController {
    @Autowired
    private TodoService todoService;

    @PostMapping("/createtodolist/{content}")
    public void create(@PathVariable("content") String content){
        todoService.createTodo(content);
    }

    @PutMapping("/updatecontent/{id}/{content}")
    public void updatec(@PathVariable("id") Integer id,@PathVariable("content") String content){
        todoService.updateContent(id,content);
    }

    @PutMapping("/updatestatus/{id}")
    public void updates(@PathVariable("id") Integer id){
        todoService.updateStatus(id);
    }

    @GetMapping("/getalllist")
    public List<Todolist> get(){
        return todoService.getTodolist();
    }

    @DeleteMapping("/deletetodolist/{id}")
    public void delete(@PathVariable("id") Integer id){
        todoService.deleteTodo(id);
    }

    @GetMapping("/findexist/{id}")
    public int exist(@PathVariable("id") Integer id) {
        return todoService.findIdExist(id);
    }

}
