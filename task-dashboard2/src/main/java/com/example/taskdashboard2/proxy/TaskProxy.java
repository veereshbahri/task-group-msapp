package com.example.taskdashboard2.proxy;

import com.example.taskdashboard2.model.Task;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@FeignClient("task-group")
public interface TaskProxy {
    @PostMapping("task_dashboard/tasks")
    public Task proxycreateTasks();
    @PutMapping("task_dashboard/tasks")
    public Task proxyupdateTask(Task task);
    @DeleteMapping(value = "/tasks")
    public String proxydeleteTask(@RequestBody Task task);
    @DeleteMapping(value = "/tasks/{id}")
    public String proxydeleteTaskByID(@PathVariable("id")int id);
}