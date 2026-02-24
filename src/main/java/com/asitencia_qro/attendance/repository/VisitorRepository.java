package com.asitencia_qro.attendance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asitencia_qro.attendance.model.VisitorModel;

public interface VisitorRepository extends JpaRepository<VisitorModel, Integer> {
    
}
