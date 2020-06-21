package com.example.taskgroup.service;

import com.example.taskgroup.model.Groups;

import java.util.Optional;

public interface GroupService {
public Iterable<Groups> getGroups();
public Optional<Groups> getGroupByID(int id);
public Groups createUpdateGroup(Groups group);
public void deleteGroup(Groups group);
public void deleteGroupByID(int id);

}
