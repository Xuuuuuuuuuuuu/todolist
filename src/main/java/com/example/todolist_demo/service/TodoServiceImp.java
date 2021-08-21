package com.example.todolist_demo.service;

import com.example.todolist_demo.dao.TodolistDao;
import com.example.todolist_demo.entity.Todolist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;

@ComponentScan({"com.example.todolist_demo.dao"})
@Service
public class TodoServiceImp implements TodoService{

    @Autowired
    private TodolistDao todolistDao;
    @Override
    public void createTodo(String content) {
        if(content == ""){
            System.out.println("请输入代办事项内容后再创建\n");
        }else{
            todolistDao.createTodo(content);
            System.out.println("创建代办事项成功\n");
        }
    }

    @Override
    public void updateContent(Integer id, String content) {
        todolistDao.updateContent(id,content);
    }

    @Override
    public void updateStatus(Integer id) {
        todolistDao.updateStatus(id);
    }

    @Override
    public List<Todolist> getTodolist() {
        return todolistDao.getTodolist();
    }

    @Override
    public void deleteTodo(Integer id) {
        todolistDao.deleteTodo(id);
    }

    @Override
    public void addPicture(Integer id, MultipartFile picture) {

    }
}
