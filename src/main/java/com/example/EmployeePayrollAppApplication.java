package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;



@SpringBootApplication
@Slf4j
public class EmployeePayrollAppApplication {

	public static void main(String[] args) {
		log.info("Employee Payroll App Started");	
		System.out.println("Welcome");
		SpringApplication.run(EmployeePayrollAppApplication.class, args);
		
	}

}
