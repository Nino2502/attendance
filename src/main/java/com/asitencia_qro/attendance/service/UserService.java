package com.asitencia_qro.attendance.service;

import java.util.List;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import org.springframework.stereotype.Service;

import com.asitencia_qro.attendance.model.UserModel;
import com.asitencia_qro.attendance.repository.UsersRepository;

import java.util.UUID;

@Service
public class UserService {

    private final UsersRepository userRepository;
    private final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public UserService(UsersRepository userRepository){
        this.userRepository = userRepository;
    }

    public UserModel saveUser(UserModel user){

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);

    }
    public List<UserModel> getAllUsers(){
        return userRepository.findAll();
    }

    public UserModel findByEmail(String email) {
        return userRepository.findByEmail(email).orElse(null);
    }
  
}