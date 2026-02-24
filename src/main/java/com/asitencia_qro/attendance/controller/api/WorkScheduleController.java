package com.asitencia_qro.attendance.controller.api;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asitencia_qro.attendance.model.WorkScheduleModel;
import com.asitencia_qro.attendance.service.WorkScheduleService;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/api/schedules")
@RequiredArgsConstructor
public class WorkScheduleController {

    private final WorkScheduleService service;

    @PostMapping
    public WorkScheduleModel create(@RequestBody WorkScheduleModel schedule) {
        return service.create(schedule);
    }

    @GetMapping
    public List<WorkScheduleModel> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public WorkScheduleModel getById(
        @PathVariable Integer id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
