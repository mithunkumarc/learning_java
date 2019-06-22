package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Employees;
import com.example.demo.repository.EmployeeDao;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {
	@Autowired
	private EmployeeDao employeeDao;
	
	
	@GetMapping(path="/",produces = "application/json")
	public Employees getEmployees() {
		return employeeDao.getAllEmployees();
	}
}
