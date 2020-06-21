package com.example.taskdashboard.proxy;

import com.example.taskdashboard.model.Task;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient("task-group")
public interface TaskProxy {
    @GetMapping("task_dashboard/tasks")
    public Iterable<Task> proxygetTasks();
    @GetMapping("task_dashboard/tasks/{id}")
    public Optional<Task> proxygetTask(@PathVariable("id")int id);
}
