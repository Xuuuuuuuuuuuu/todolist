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
        if(content != ""){
            todolistDao.createTodo(content);
            System.out.println("创建代办事项成功\n");

        }else{
            System.out.println("请输入内容后确定创建\n");
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
        int value = todolistDao.deleteTodo(id);
        if(value == 0){
            System.out.println("未找到指定id的待办事项，请确认后再次输入\n");
        }else {
            System.out.println("删除代办事项成功\n");
        }
    }

    @Override
    public void addPicture(Integer id, MultipartFile picture) {

    }

    @Override
    public int findIdExist(Integer id) {
        return todolistDao.findIdExist(id);
    }
}
