package com.asitencia_qro.attendance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asitencia_qro.attendance.model.DepartamentModel;


public interface DepartamentsRepository extends JpaRepository<DepartamentModel, Integer> {
    
}
