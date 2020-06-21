package com.example.groupdashboard.controller;

import com.example.groupdashboard.model.Groups;
import com.example.groupdashboard.proxy.GroupsProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class GroupsController {
    private GroupsProxy proxy;

    @Autowired
    public GroupsController(GroupsProxy proxy) {
        this.proxy = proxy;
    }
    @GetMapping(value = "/",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Iterable<Groups>> getGroups()
    {
        return ResponseEntity.status(HttpStatus.OK).body(proxy.proxygetGroups());
    }
    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Optional<Groups>> getGroup(@PathVariable("id")int id)
    {
        return ResponseEntity.status(HttpStatus.OK).body(proxy.proxygetGroup(id));
    }
}
