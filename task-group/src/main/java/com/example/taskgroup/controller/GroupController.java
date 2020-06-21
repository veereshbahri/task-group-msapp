package com.example.taskgroup.controller;

import com.example.taskgroup.model.Groups;
import com.example.taskgroup.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/group_dashboard")
public class GroupController {
    private GroupService groupService;

    @Autowired
    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }
    @GetMapping(value = "/groups",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Iterable<Groups>> getGroups()
    {
        return ResponseEntity.status(HttpStatus.OK).body(groupService.getGroups());
    }
    @GetMapping(value = "/groups/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Optional<Groups>> getGroup(@PathVariable("id")int id)
    {
        return ResponseEntity.status(HttpStatus.OK).body(groupService.getGroupByID(id));
    }
    @PostMapping(value = "/groups", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Groups> createGroup(@RequestBody Groups group)
    {
        return ResponseEntity.status(HttpStatus.OK).body(groupService.createUpdateGroup(group));
    }
    @PutMapping(value = "/groups", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Groups> updateGroup(@RequestBody Groups group)
    {
        return ResponseEntity.status(HttpStatus.OK).body((groupService.createUpdateGroup(group)));
    }
    @DeleteMapping(value = "/groups",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> deleteGroup(@RequestBody Groups group)
    {
        groupService.deleteGroup(group);
        return ResponseEntity.status(HttpStatus.OK).body("Deleted Successfully!");
    }
    @DeleteMapping(value = "/groups/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> deleteGroupByID(@PathVariable("id")int id)
    {
        groupService.deleteGroupByID(id);
        return ResponseEntity.status(HttpStatus.OK).body("Deleted Successfully By ID!");
    }
}
