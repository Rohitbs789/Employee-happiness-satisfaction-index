package com.happinessindex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.happinessindex.Entity.EmployeeEntity;
import com.happinessindex.Services.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService empservice;
	
	@PostMapping
	public ResponseEntity<EmployeeEntity> saveEmployeeDetails(@RequestBody EmployeeEntity emp) {
		EmployeeEntity employee= empservice.saveEmployee(emp);
		return ResponseEntity.status(HttpStatus.CREATED).body(employee);
	}

}
