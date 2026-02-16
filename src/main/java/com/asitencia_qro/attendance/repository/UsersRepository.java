package com.asitencia_qro.attendance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.asitencia_qro.attendance.model.UserModel;

public interface UsersRepository extends JpaRepository<UserModel, Integer> {
    
}
