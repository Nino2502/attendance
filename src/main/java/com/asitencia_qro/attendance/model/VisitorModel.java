package com.asitencia_qro.attendance.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "visitors")
public class VisitorModel {

      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    private String company;

    private String reason;

    @ManyToOne
    @JoinColumn(name = "person_to_visit")
    private UserModel personToVisit;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private DepartamentModel department;

    @Column(name = "badge_number")
    private String badgeNumber;

    @Column(name = "check_in", updatable = false)
    private LocalDateTime checkIn;

    @Column(name = "check_out")
    private LocalDateTime checkOut;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;


    @PrePersist
    public void prePersist() {
        this.createdAt = LocalDateTime.now();
        this.checkIn = LocalDateTime.now();

    }
    
}
