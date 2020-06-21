package com.example.taskgroup.service;

import com.example.taskgroup.dao.TaskRepository;
import com.example.taskgroup.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;
@Service("taskService")
public class TaskServiceImpl implements TaskService{
    private TaskRepository repository;

    @Autowired
    public TaskServiceImpl(TaskRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public Iterable<Task> getTasks() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public Optional<Task> getTaskByID(int id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public Task createUpdateTask(Task task) {
        return repository.save(task);
    }

    @Override
    @Transactional
    public void deleteTask(Task task) {
        repository.delete(task);
    }

    @Override
    @Transactional
    public void deleteTaskByID(int id) {
        repository.deleteById(id);
    }
}
