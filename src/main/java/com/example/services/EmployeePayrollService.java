package com.example.services;

import java.util.ArrayList;
import java.util.List;

import com.example.dto.EmployeePayrollDTO;
import com.example.model.EmployeePayrollData;

import org.springframework.stereotype.Service;
import com.example.exceptions.EmployeePayrollException;
 

@Service  
public class EmployeePayrollService implements IEmployeePayrollService {

	 private List<EmployeePayrollData> employeePayrollList = new ArrayList<>();

	    @Override
	    public List<EmployeePayrollData> getEmployeePayrollData() {
	        return employeePayrollList;
	    }

	    @Override
	    public EmployeePayrollData getEmployeePayrollDataById(int empId) {
	    	 return employeePayrollList.stream()
	                 .filter(empData -> empData.getEmployeeId() == empId)
	                 .findFirst()
	                 .orElseThrow(() -> new EmployeePayrollException("Employee Not Found"));
	    
	    }

	    @Override
	    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
	        EmployeePayrollData empData = null;
	        empData = new EmployeePayrollData(employeePayrollList.size()+1, empPayrollDTO);
	        employeePayrollList.add(empData);
	        return empData;
	    }

	    @Override
	    public EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO empPayrollDTO) {
	        EmployeePayrollData empData = this.getEmployeePayrollDataById(empId);
	        empData.setName(empPayrollDTO.name);
	        empData.setSalary(empPayrollDTO.salary);
	        employeePayrollList.set(empId-1, empData);
	        return empData;
	    }

	    @Override
	    public void deleteEmployeePayrollData(int empId) {
	        employeePayrollList.remove(empId-1);
	    }
	    
   
}