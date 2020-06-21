package com.example.taskgroup.service;
import com.example.taskgroup.model.Task;
import java.util.Optional;

public interface TaskService {
    public Iterable<Task> getTasks();
    public Optional<Task> getTaskByID(int id);
    public Task createUpdateTask(Task task);
    public void deleteTask(Task task);
    public void deleteTaskByID(int id);
}
