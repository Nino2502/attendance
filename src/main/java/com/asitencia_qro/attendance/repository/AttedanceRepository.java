package com.asitencia_qro.attendance.repository;


import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asitencia_qro.attendance.model.AttedanceModel;

public interface AttedanceRepository extends JpaRepository<AttedanceModel, Integer> {
        Optional<AttedanceModel> findByUserIdAndCheckInTimeBetween(
        Integer userId,
        LocalDate start,
        LocalDate end
    );
}
