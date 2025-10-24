package com.todolist;

public class Task {

    private int id;
    private String title;
    private String desc;
    private String status;

    Task(int id ,String title,String desc){
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.status= "pending";
    }

    public  int getId(){
        return id;
    }
    public  String getTitle(){
        return  title;
    }
    public  void  setTitle(String title){
        this.title = this.title;
    }
    public String getDesc(){
        return desc;
    }
    public void setDesc(String desc){
        this.desc= this.desc;
    }
    public  String getStatus(){
        return status;
    }
    public void markAsDone(){
        this.status="done";
    }

    @Override
    public String toString(){
        return "ID: " + id + " | Title: " + title + " | Description: " + desc + " | Status: " + status;
    }
}
