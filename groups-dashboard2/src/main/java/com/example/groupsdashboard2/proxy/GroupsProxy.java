package com.example.groupsdashboard2.proxy;

import com.example.groupsdashboard2.model.Groups;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient("task-group")
public interface GroupsProxy {
    @PostMapping("group_dashboard/groups")
    public Groups proxycreateGroups();
    @PutMapping("group_dashboard/groups")
    public Groups proxyupdateGroup(Groups group);
    @DeleteMapping(value = "/groups")
    public String proxydeleteGroup(@RequestBody Groups group);
    @DeleteMapping(value = "/groups/{id}")
    public String proxydeleteGroupByID(@PathVariable("id")int id);

}
