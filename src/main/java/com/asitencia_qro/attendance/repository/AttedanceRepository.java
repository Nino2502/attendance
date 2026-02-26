package com.asitencia_qro.attendance.repository;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asitencia_qro.attendance.model.AttedanceModel;

public interface AttedanceRepository 
        extends JpaRepository<AttedanceModel, UUID> {

    Optional<AttedanceModel> findByUser_IdAndCheckInTimeBetween(
            UUID userId,
            LocalDateTime start,
            LocalDateTime end
    );
}