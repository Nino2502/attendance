package com.asitencia_qro.attendance.controller.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asitencia_qro.attendance.model.DepartamentModel;
import com.asitencia_qro.attendance.service.DepartamentsService;


@RestController
@RequestMapping("/api/departaments")
public class DepartamentsController {
    private final DepartamentsService departamentsService;

    public DepartamentsController(DepartamentsService departamentsService){
        this.departamentsService = departamentsService;
    }

    @PostMapping
    public DepartamentModel createDep(@RequestBody DepartamentModel dep){
        return departamentsService.saveDepartament(dep);
    }

    @GetMapping
    public List<DepartamentModel> getDepartements(){
        return departamentsService.getAllDepartaments();
    }
}
