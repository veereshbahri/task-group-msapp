package com.example.taskdashboard2.controller;

import com.example.taskdashboard2.model.Task;
import com.example.taskdashboard2.proxy.TaskProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TaskController {
    private TaskProxy proxy;
    @Autowired
    public TaskController(TaskProxy proxy) {
        this.proxy = proxy;
    }
    @PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Task> createTask(@RequestBody Task task)
    {
        return ResponseEntity.status(HttpStatus.OK).body(proxy.proxycreateTasks());
    }
    @PutMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Task> updateTask(@RequestBody Task task)
    {
        return ResponseEntity.status(HttpStatus.OK).body(proxy.proxyupdateTask(task));
    }
    @DeleteMapping(value = "/",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> deleteTask(@RequestBody Task task)
    {
        proxy.proxydeleteTask(task);
        return ResponseEntity.status(HttpStatus.OK).body("Deleted Successfully!");
    }
    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> deleteTaskByID(@PathVariable("id")int id)
    {
        proxy.proxydeleteTaskByID(id);
        return ResponseEntity.status(HttpStatus.OK).body("Deleted Successfully By ID!");
    }
}
