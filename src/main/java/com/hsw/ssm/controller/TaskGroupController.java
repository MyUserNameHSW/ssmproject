package com.hsw.ssm.controller;

import com.hsw.ssm.model.TaskGroup;
import com.hsw.ssm.service.TaskGroupService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/group")
public class TaskGroupController {
    @Resource
    TaskGroupService groupService;

    @RequestMapping("getItem")
    @ResponseBody
    public TaskGroup getItem(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        return groupService.getItemById(id);
    }
}
