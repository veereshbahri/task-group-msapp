package com.example.taskgroup.dao;

import com.example.taskgroup.model.Groups;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Repository("groupsRepository")
@EnableAutoConfiguration
@EnableTransactionManagement
public interface GroupsRepository extends CrudRepository<Groups,Integer> {
}
