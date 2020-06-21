package com.example.taskgroup.service;

import com.example.taskgroup.dao.GroupsRepository;

import com.example.taskgroup.model.Groups;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;
@Service("groupService")
public class GroupServiceImpl implements GroupService{
    private GroupsRepository repository;

    @Autowired
    public GroupServiceImpl(GroupsRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public Iterable<Groups> getGroups() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public Optional<Groups> getGroupByID(int id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public Groups createUpdateGroup(Groups group) {
        return repository.save(group);
    }

    @Override
    @Transactional
    public void deleteGroup(Groups group) {
        repository.delete(group);
    }

    @Override
    @Transactional
    public void deleteGroupByID(int id) {
        repository.deleteById(id);

    }
}
