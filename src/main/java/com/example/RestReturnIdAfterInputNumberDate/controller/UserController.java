package com.example.RestReturnIdAfterInputNumberDate.controller;

import com.example.RestReturnIdAfterInputNumberDate.entities.User;
import com.example.RestReturnIdAfterInputNumberDate.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/add")
    private Long addUser(@Valid @RequestBody User user) {
        return userService.addUser(user);
    }
}
