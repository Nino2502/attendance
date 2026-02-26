package com.asitencia_qro.attendance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asitencia_qro.attendance.model.WorkScheduleModel;

import java.util.UUID;

public interface WorkScheduleRepository 
        extends JpaRepository<WorkScheduleModel, UUID> {
}
