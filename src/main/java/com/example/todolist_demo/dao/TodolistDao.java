package com.example.todolist_demo.dao;

import com.example.todolist_demo.entity.Todolist;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Mapper
@Repository
public interface TodolistDao{
    public void createTodo(String content);

    public void updateContent(Integer id,String content);

    public void updateStatus(Integer id);

    public List<Todolist> getTodolist();

    public void deleteTodo(Integer id);

    public void addPicture(Integer id, MultipartFile picture);

}
