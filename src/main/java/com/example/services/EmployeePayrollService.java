package com.example.services;

import java.util.List;

import com.example.dto.EmployeePayrollDTO;
import com.example.model.EmployeePayrollData;
import com.example.repository.EmployeePayrollRepository;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.exceptions.EmployeePayrollException;
 

@Service  
@Slf4j
public class EmployeePayrollService implements IEmployeePayrollService {

	@Autowired
    private EmployeePayrollRepository employeeRepository;

	 public List<EmployeePayrollData> getEmployeePayrollData() {
	        return employeeRepository.findAll();
	    }

	 
	 @Override
	    public EmployeePayrollData getEmployeePayrollDataById(int empId) {
	        return employeeRepository
	                .findById(empId)
	                .orElseThrow(() -> new EmployeePayrollException("Employee with employeeId " +
	                                       empId + " does not exists..!!"));
	    }

	 @Override
	    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
	        EmployeePayrollData empData = null;
	        empData = new EmployeePayrollData(empPayrollDTO);
	        log.debug("Emp Data: " +empData.toString());
	        return employeeRepository.save(empData);
	    }
	 

	 @Override
	    public EmployeePayrollData updateEmployeePayrollData(int empId, 
	                                                         EmployeePayrollDTO empPayrollDTO) {
	        EmployeePayrollData empData = this.getEmployeePayrollDataById(empId);
	        empData.updateEmployeePayrollData(empPayrollDTO);
	        return employeeRepository.save(empData);
	    }
	 

	 @Override
	    public void deleteEmployeePayrollData(int empId) {
	        EmployeePayrollData empData = this.getEmployeePayrollDataById(empId);
	        employeeRepository.delete(empData);
	    }
	    
   
}