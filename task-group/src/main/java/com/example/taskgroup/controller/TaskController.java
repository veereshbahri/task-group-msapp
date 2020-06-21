package com.example.taskgroup.controller;

import com.example.taskgroup.model.Task;
import com.example.taskgroup.service.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/task_dashboard")
public class TaskController {
    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    @GetMapping(value = "/tasks",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Iterable<Task>> getTasks()
    {
        return ResponseEntity.status(HttpStatus.OK).body(taskService.getTasks());
    }
    @GetMapping(value = "/tasks/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Optional<Task>> getTask(@PathVariable("id")int id)
    {
        return ResponseEntity.status(HttpStatus.OK).body(taskService.getTaskByID(id));
    }
    @PostMapping(value = "/tasks", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Task> createTask(@RequestBody Task task)
    {
        return ResponseEntity.status(HttpStatus.OK).body(taskService.createUpdateTask(task));
    }
    @PutMapping(value = "/tasks", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Task> updateTask(@RequestBody Task task)
    {
        return ResponseEntity.status(HttpStatus.OK).body((taskService.createUpdateTask(task)));
    }
    @DeleteMapping(value = "/tasks",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> deleteTask(@RequestBody Task task)
    {
        taskService.deleteTask(task);
        return ResponseEntity.status(HttpStatus.OK).body("Deleted Successfully!");
    }
    @DeleteMapping(value = "/tasks/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> deleteTaskByID(@PathVariable("id")int id)
    {
        taskService.deleteTaskByID(id);
        return ResponseEntity.status(HttpStatus.OK).body("Deleted Successfully By ID!");
    }
}
