package com.example.repository;

import com.example.model.EmployeePayrollData;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeePayrollRepository extends JpaRepository<EmployeePayrollData, Integer> {
    
}