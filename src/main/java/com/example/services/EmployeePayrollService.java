package com.example.services;


import java.util.ArrayList;
import java.util.List;

import com.example.dto.EmployeePayrollDTO;
import com.example.model.EmployeePayrollData;

import org.springframework.stereotype.Service;

@Service  
public class EmployeePayrollService implements IEmployeePayrollService {

    @Override
    public List<EmployeePayrollData> getEmployeePayrollData() {
        List<EmployeePayrollData> employeePayrollList = new ArrayList<>();
        employeePayrollList.add(new EmployeePayrollData(1, new EmployeePayrollDTO("Pankaj", 3000)));
        return employeePayrollList;
    }

    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int empId) {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(1, new EmployeePayrollDTO("Pankaj", 30000));
        return empData;
    }

    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(1, empPayrollDTO);
        return empData;
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(1, empPayrollDTO);
        return empData;
    }

    @Override
    public void deleteEmployeePayrollData(int empId) {
        // TODO Auto-generated method stub

    }
    
}