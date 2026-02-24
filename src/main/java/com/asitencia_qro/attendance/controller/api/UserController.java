package com.asitencia_qro.attendance.controller.api;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asitencia_qro.attendance.model.UserModel;
import com.asitencia_qro.attendance.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public UserModel createUser(@RequestBody UserModel user){
        return userService.saveUser(user);
    }

    @GetMapping
    public List<UserModel> getUsers(){
        return userService.getAllUsers();

    }


    
}
