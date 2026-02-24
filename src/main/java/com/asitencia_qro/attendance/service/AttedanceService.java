package com.asitencia_qro.attendance.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.asitencia_qro.attendance.model.AttedanceModel;
import com.asitencia_qro.attendance.model.UserModel;
import com.asitencia_qro.attendance.repository.AttedanceRepository;
import com.asitencia_qro.attendance.repository.UsersRepository;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class AttedanceService {

    private final AttedanceRepository attendanceRepository;
    private final UsersRepository userRepository;

    public AttedanceModel registerAttendance(Integer userId) {

        UserModel user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        LocalDateTime now = LocalDateTime.now();
        LocalDate today = LocalDate.now();

        // Buscar si ya existe registro hoy
        Optional<AttedanceModel> existing = attendanceRepository
                .findAll()
                .stream()
                .filter(a -> a.getUser().getId().equals(userId)
                        && a.getCheckInTime().toLocalDate().equals(today))
                .findFirst();

        if (existing.isEmpty()) {
            // CHECK IN

            String status = calculateStatus(user, now);

            AttedanceModel attendance = AttedanceModel.builder()
                    .user(user)
                    .checkInTime(now)
                    .status(status)
                    .build();

            return attendanceRepository.save(attendance);

        } else {
            // CHECK OUT

            AttedanceModel attendance = existing.get();
            attendance.setCheckOutTime(now);

            return attendanceRepository.save(attendance);
        }
    }

    private String calculateStatus(UserModel user, LocalDateTime checkInTime) {

        LocalTime entryTime = user.getSchedule().getEntryTime();
        int tolerance = user.getSchedule().getToleranceMinutes();

        LocalTime limit = entryTime.plusMinutes(tolerance);

        if (checkInTime.toLocalTime().isAfter(limit)) {
            return "LATE";
        }

        return "ON_TIME";
    }
    
}
