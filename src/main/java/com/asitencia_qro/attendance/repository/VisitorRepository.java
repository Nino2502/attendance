package com.asitencia_qro.attendance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asitencia_qro.attendance.model.VisitorModel;

import java.util.UUID;

public interface VisitorRepository extends JpaRepository<VisitorModel, UUID> {
    
}
