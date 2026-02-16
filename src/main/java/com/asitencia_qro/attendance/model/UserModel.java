package com.asitencia_qro.attendance.model;
import jakarta.persistence.*;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "employee_code")
    private String employeeCode;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String email;

    private String password;

    @Column(name = "department_id")
    private Integer departmentId;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private RoleModel role;

    @Column(name = "schedule_id")
    private Integer scheduleId;

    private Boolean active;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

}

