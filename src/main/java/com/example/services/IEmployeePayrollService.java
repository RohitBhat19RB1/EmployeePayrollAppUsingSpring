package com.example.services;
import java.util.List;

import com.example.dto.EmployeePayrollDTO;
import com.example.model.EmployeePayrollData;

public interface IEmployeePayrollService {
    
    List<EmployeePayrollData> getEmployeePayrollData();

    EmployeePayrollData getEmployeePayrollDataById(int empId);

    EmployeePayrollData createEmployeePayrollData(
                        EmployeePayrollDTO empPayrollDTO);
     
    EmployeePayrollData updateEmployeePayrollData(int empId,
                        EmployeePayrollDTO empPayrollDTO);
    
    void deleteEmployeePayrollData(int empId);

}