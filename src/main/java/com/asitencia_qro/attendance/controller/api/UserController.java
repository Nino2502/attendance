package com.asitencia_qro.attendance.controller.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asitencia_qro.attendance.model.UserModel;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import com.asitencia_qro.attendance.service.UserService;

import com.asitencia_qro.attendance.dto.LoginRequest;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public UserModel createUser(@RequestBody UserModel user) {
        return userService.saveUser(user);
    }

    @GetMapping
    public List<UserModel> getUsers() {
        return userService.getAllUsers();

    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {

        UserModel user = userService.validateLogin(
                request.getEmail(),
                request.getPassword());

        if (user == null) {
            return ResponseEntity
                    .status(HttpStatus.UNAUTHORIZED)
                    .body("Credenciales incorrectas");
        }

        return ResponseEntity.ok(user);
    }

}
