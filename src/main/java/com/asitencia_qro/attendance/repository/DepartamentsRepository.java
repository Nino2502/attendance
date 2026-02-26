package com.asitencia_qro.attendance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asitencia_qro.attendance.model.DepartamentModel;
import java.util.UUID;

public interface DepartamentsRepository extends JpaRepository<DepartamentModel, UUID> {
    
}
