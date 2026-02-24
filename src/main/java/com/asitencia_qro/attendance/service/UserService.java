package com.asitencia_qro.attendance.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.asitencia_qro.attendance.model.UserModel;
import com.asitencia_qro.attendance.repository.UsersRepository;

@Service
public class UserService {

    private final UsersRepository userRepository;

    public UserService(UsersRepository userRepository){
        this.userRepository = userRepository;
    }

    public UserModel saveUser(UserModel user){
        return userRepository.save(user);

    }
    public List<UserModel> getAllUsers(){
        return userRepository.findAll();
    }

    
}
