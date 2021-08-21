package com.example.todolist_demo.service;

import com.example.todolist_demo.entity.Todolist;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface TodoService {
    public void createTodo(String content);

    public void updateContent(Integer id,String content);

    public void updateStatus(Integer id);

    public List<Todolist> getTodolist();

    public void deleteTodo(Integer id);

    public void addPicture(Integer id, MultipartFile picture);
}
