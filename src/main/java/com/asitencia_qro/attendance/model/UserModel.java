package com.asitencia_qro.attendance.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import java.util.UUID;

import org.hibernate.annotations.UuidGenerator;

@Getter
@Setter
@Entity
@Table(name = "users")
public class UserModel {

    @Id
    @UuidGenerator
    @Column(updatable = false, nullable = false)
    private UUID id;

    @Column(name = "employee_code")
    private String employeeCode;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String email;

    private String password;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private DepartamentModel departamentoId;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private RoleModel role;

    @ManyToOne
    @JoinColumn(name = "schedule_id")
    private WorkScheduleModel schedule;

    private Boolean active;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

}
