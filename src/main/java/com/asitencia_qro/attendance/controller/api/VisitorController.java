package com.asitencia_qro.attendance.controller.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asitencia_qro.attendance.model.VisitorModel;
import com.asitencia_qro.attendance.service.VisitorService;

@RestController
@RequestMapping("/api/visitors")
public class VisitorController {

    private final VisitorService visitorService;

    public VisitorController(VisitorService visitorService){
        this.visitorService = visitorService;
    }

    @GetMapping
    public List<VisitorModel> getVisitors(){
        return visitorService.getAllVisitors();
    }


    
}
