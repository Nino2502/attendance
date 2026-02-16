package com.asitencia_qro.attendance.controller;


import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.asitencia_qro.attendance.model.RoleModel;
import com.asitencia_qro.attendance.service.RoleService;

@RestController
@RequestMapping("/api/roles")
public class RoleController {
    
    private final RoleService roleService;

    public RoleController(RoleService roleService){
        this.roleService = roleService;
    }

    @GetMapping
    public List<RoleModel> getRole(){
        return roleService.getAllRoles();

    }
}
