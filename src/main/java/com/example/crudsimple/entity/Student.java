package com.example.crudsimple.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    public String firstName;

    public String secondName;

    @Column(name = "email_address", unique = true, nullable = false)
    public String email;
}
