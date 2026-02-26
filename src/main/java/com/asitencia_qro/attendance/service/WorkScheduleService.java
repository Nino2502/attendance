package com.asitencia_qro.attendance.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.asitencia_qro.attendance.model.WorkScheduleModel;
import com.asitencia_qro.attendance.repository.WorkScheduleRepository;

import lombok.RequiredArgsConstructor;
import java.util.UUID;

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

    public WorkScheduleModel getById(UUID id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Horario no encontrado"));
    }

    public void delete(UUID id) {
        repository.deleteById(id);
    }
}
