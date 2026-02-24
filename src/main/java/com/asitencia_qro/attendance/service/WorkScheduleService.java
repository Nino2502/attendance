package com.asitencia_qro.attendance.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.asitencia_qro.attendance.model.WorkScheduleModel;
import com.asitencia_qro.attendance.repository.WorkScheduleRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class WorkScheduleService {

    private final WorkScheduleRepository repository;

    public WorkScheduleModel create(WorkScheduleModel schedule) {
        return repository.save(schedule);
    }

    public List<WorkScheduleModel> getAll() {
        return repository.findAll();
    }

    public WorkScheduleModel getById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Horario no encontrado"));
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
