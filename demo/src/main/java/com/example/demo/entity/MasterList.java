package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "master_list")
@Data
public class MasterList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String parentCode;
    private String parentName;
    private String name;
    private String plan;
    private String option;
    private String optionFrequency;

    @Column(columnDefinition = "jsonb")
    private String transactionModeAllowed;

    private String subCategory;
    private String sector;
    private String benchmark;
    private Integer faceValue;
}