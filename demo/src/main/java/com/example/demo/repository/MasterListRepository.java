package com.example.demo.repository;

import com.example.demo.entity.MasterList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MasterListRepository extends JpaRepository<MasterList, Long> {
}