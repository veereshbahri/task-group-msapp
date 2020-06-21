package com.example.taskgroup.dao;

import com.example.taskgroup.model.Task;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Repository("taskRepository")
@EnableAutoConfiguration
@EnableTransactionManagement
public interface TaskRepository extends CrudRepository<Task,Integer> {
}
