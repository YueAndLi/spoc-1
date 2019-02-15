package com.edu.spoc.controller;

import com.edu.spoc.base.model.Result;
import com.edu.spoc.model.SysUser;
import com.edu.spoc.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController {

    @Resource
    private UserService userService;

    @PostMapping("/addUser")
    public Result addUser(@RequestBody SysUser sysUser) {
        userService.addUser(sysUser);
        return success();
    }
    @PostMapping("/importUsers")
    public void importUsers() {

    }

}
