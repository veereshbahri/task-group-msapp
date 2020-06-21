package com.example.taskdashboard2.model;

import java.util.List;

public class Groups {
    private int id;
    private String name;
    private String status;
    private List<Task> tasks;

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", tasks=" + tasks +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public Groups() {
    }

    public Groups(int id, String name, String status, List<Task> tasks) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.tasks = tasks;
    }
}
