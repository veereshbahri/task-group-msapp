package com.example.groupdashboard.proxy;

import com.example.groupdashboard.model.Groups;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient("task-group")
public interface GroupsProxy {
    @GetMapping("/group_dashboard/groups")
    public Iterable<Groups> proxygetGroups();
    @GetMapping("/group_dashboard/groups/{id}")
    public Optional<Groups> proxygetGroup(@PathVariable("id")int id);
}
