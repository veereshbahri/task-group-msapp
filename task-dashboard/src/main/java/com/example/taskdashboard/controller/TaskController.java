package com.example.taskdashboard.controller;

import com.example.taskdashboard.model.Task;
import com.example.taskdashboard.proxy.TaskProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class TaskController {
    private TaskProxy proxy;
    @Autowired
    public TaskController(TaskProxy proxy) {
        this.proxy = proxy;
    }
    @GetMapping(value = "/",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Iterable<Task>> getTasks()
    {
        return ResponseEntity.status(HttpStatus.OK).body(proxy.proxygetTasks());
    }
    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Optional<Task>> getTask(@PathVariable("id")int id)
    {
        return ResponseEntity.status(HttpStatus.OK).body(proxy.proxygetTask(id));
    }
}
