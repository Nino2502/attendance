package com.asitencia_qro.attendance.controller.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asitencia_qro.attendance.model.AttedanceModel;
import com.asitencia_qro.attendance.repository.AttedanceRepository;
import com.asitencia_qro.attendance.service.AttedanceService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/attendance")
@RequiredArgsConstructor
public class AttendanceController {

    private final AttedanceService attendanceService;
    private final AttedanceRepository attendanceRepository;


    @PostMapping("/register/{userId}")
    public AttedanceModel register(@PathVariable Integer userId) {
        return attendanceService.registerAttendance(userId);
    }


    @GetMapping
    public List<AttedanceModel> getAll() {
        return attendanceRepository.findAll();
    }


    @GetMapping("/user/{userId}")
    public List<AttedanceModel> getByUser(@PathVariable Integer userId) {
        return attendanceRepository.findAll()
                .stream()
                .filter(a -> a.getUser().getId().equals(userId))
                .toList();
    }

}
