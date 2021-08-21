package com.example.todolist_demo.entity;

public class Todolist {
    private Integer id;
    private Integer status=0;
    private String content;

    public Todolist() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Todolist{" +
                "id=" + id +
                ", status=" + status +
                ", content='" + content + '\'' +
                '}';
    }
}
