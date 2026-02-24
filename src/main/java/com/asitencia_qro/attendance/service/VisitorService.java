package com.asitencia_qro.attendance.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.asitencia_qro.attendance.model.VisitorModel;
import com.asitencia_qro.attendance.repository.VisitorRepository;

@Service
public class VisitorService {

    private final VisitorRepository visitorRepository;

    public VisitorService(VisitorRepository visitorRepository) {

        this.visitorRepository = visitorRepository;

    }

    public VisitorModel saveVisitor(VisitorModel vist){
        return visitorRepository.save(vist);
    }

    public List<VisitorModel> getAllVisitors(){
        return visitorRepository.findAll();
    }


    
}
