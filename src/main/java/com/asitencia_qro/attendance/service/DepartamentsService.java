package com.asitencia_qro.attendance.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.asitencia_qro.attendance.model.DepartamentModel;
import com.asitencia_qro.attendance.repository.DepartamentsRepository;


@Service
public class DepartamentsService {

    private final DepartamentsRepository departamentoRepository;

    public DepartamentsService(DepartamentsRepository departamentoRepository){
            this.departamentoRepository =  departamentoRepository;
    }

    public DepartamentModel saveDepartament(DepartamentModel dep){
        return departamentoRepository.save(dep);
    }

    public List<DepartamentModel> getAllDepartaments(){
        return departamentoRepository.findAll();
    }
    
}
