package com.asitencia_qro.attendance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.asitencia_qro.attendance.model.RoleModel;
import java.util.UUID;

public interface RoleRepository extends JpaRepository<RoleModel, UUID> {

}
