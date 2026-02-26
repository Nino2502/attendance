package com.asitencia_qro.attendance.repository;


import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.asitencia_qro.attendance.model.UserModel;

import java.util.UUID;

public interface UsersRepository extends JpaRepository<UserModel, UUID> {

    Optional<UserModel> findByEmail(String email);
    
}
