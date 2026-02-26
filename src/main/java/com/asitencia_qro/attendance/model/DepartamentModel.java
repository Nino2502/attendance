package com.asitencia_qro.attendance.model;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
import org.hibernate.annotations.UuidGenerator;

@Getter
@Setter
@Entity
@Table(name = "departments")

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DepartamentModel {

    @Id
    @UuidGenerator
    private UUID id;

    @Column(name = "name", length=100, nullable = false)
    private String name; 

    @Column(name = "description", columnDefinition="TEXT")
    private String description;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @PrePersist
    private void onCreate(){
        createdAt = LocalDateTime.now();
    }

}
