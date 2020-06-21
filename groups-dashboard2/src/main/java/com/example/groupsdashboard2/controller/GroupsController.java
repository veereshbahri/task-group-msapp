package com.example.groupsdashboard2.controller;

import com.example.groupsdashboard2.model.Groups;
import com.example.groupsdashboard2.proxy.GroupsProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GroupsController {
    private GroupsProxy proxy;

    @Autowired
    public GroupsController(GroupsProxy proxy) {
        this.proxy = proxy;
    }
    @PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Groups> creategroups(@RequestBody Groups group)
    {
        return ResponseEntity.status(HttpStatus.OK).body(proxy.proxycreateGroups());
    }
    @PutMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Groups> updategroups(@RequestBody Groups group)
    {
        return ResponseEntity.status(HttpStatus.OK).body(proxy.proxyupdateGroup(group));
    }
    @DeleteMapping(value = "/",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> deletegroups(@RequestBody Groups group)
    {
        proxy.proxydeleteGroup(group);
        return ResponseEntity.status(HttpStatus.OK).body("Deleted Successfully!");
    }
    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> deletegroupsByID(@PathVariable("id")int id)
    {
        proxy.proxydeleteGroupByID(id);
        return ResponseEntity.status(HttpStatus.OK).body("Deleted Successfully By ID!");
    }
}
