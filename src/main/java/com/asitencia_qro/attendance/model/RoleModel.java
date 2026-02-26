package com.asitencia_qro.attendance.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

import java.util.UUID;
import org.hibernate.annotations.UuidGenerator;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//Para represetar una tabla
@Entity
//Solo ponemos el nombre a la tabla
@Table(name = "roles")
public class RoleModel {

    //Esto es para identificar PK
    @Id
    @UuidGenerator
    private UUID id;

    //No permite null ni duplicados
    @Column(nullable = false, unique = true)
    private String name;

    private String description;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }
}
