package com.zhang.boot2.controller;

import com.zhang.boot2.entity.User;
import com.zhang.boot2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/add")
    public int addUser(User user) {
        return userService.addUser(user);
    }

    @GetMapping("/get")
    public User getUser(int id) {
        return userService.getUser(id);
    }
}
