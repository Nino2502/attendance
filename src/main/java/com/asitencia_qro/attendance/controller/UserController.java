package com.asitencia_qro.attendance.controller;


import java.util.List;
import org.springframework.web.bind.annotation.*;
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
        return userService.savaUser(user);
    }

    @GetMapping
    public List<UserModel> getUsers(){
        return userService.getAllUsers();

    }


    
}
