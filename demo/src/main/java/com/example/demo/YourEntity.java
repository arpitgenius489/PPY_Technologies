package com.example.demo;

import jakarta.persistence.*;

@Entity
public class YourEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column // Removed columnDefinition for jsonb
    private String jsonData; // jsonData is now a simple String

    // Getters and setters
}