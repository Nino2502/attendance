package com.asitencia_qro.attendance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.asitencia_qro.attendance.model.RoleModel;

public interface RoleRepository extends JpaRepository<RoleModel, Integer> {

}
