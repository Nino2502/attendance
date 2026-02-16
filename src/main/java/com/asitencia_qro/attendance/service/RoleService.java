package com.asitencia_qro.attendance.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.asitencia_qro.attendance.model.RoleModel;
import com.asitencia_qro.attendance.repository.RoleRepository;

@Service
public class RoleService {

    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository){
        this.roleRepository = roleRepository;
    }

    public RoleModel saveRole(RoleModel rol){
        return roleRepository.save(rol);
    }

    public List<RoleModel> getAllRoles(){
        return roleRepository.findAll();
    }
    
}
