package com.todolist;

import java.util.ArrayList;

public class TodoList {
    private ArrayList<Task> tasks;
    private int nextId;

    public TodoList(){
        tasks = new ArrayList<>();
        nextId =1;
    }

    public void addTask(String title,String desc){
        Task task = new Task(nextId++,title,desc);
        tasks.add(task);
        System.out.println("Task added");
    }

    public void updateTask(int id, String title, String desc){
        Task task = findTaskById(id);
        if (task != null){
            task.setTitle(title);
            task.setDesc(desc);
            System.out.println("task updated");
        }else{
            System.out.println("task not found");
        }
    }
    public  void deleteTask(int id){
        Task task = findTaskById(id);
        if(task != null){
            tasks.remove(task);
            System.out.println("task deleted");
        }else {
            System.out.println("task not found");
        }
    }
    public void markAsDone(int id){
        Task task = findTaskById(id);
        if (task != null){
            task.markAsDone();
            System.out.println("task done");
        }else {
            System.out.println("task not found");
        }

    }
    public void lsitAllTask(){
        if (tasks.isEmpty()){
            System.out.println("not task found");
        }else{
            for(Task task : tasks){
                System.out.println(task);
            }
        }
    }
    public void listTaskByStatus(String status){
        boolean found = false;
        for(Task task : tasks){
            if(task.getStatus().equalsIgnoreCase(status)){
                System.out.println(task);
                found = true;
            }
        }if(!found){
            System.out.println("no tasks with status: "+status);
        }
    }
    private Task findTaskById(int id){
        for (Task task : tasks){
            if (task.getId() == id){
                return  task;
            }
        }
        return null;
    }
}
