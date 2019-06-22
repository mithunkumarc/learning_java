package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Employees;
import com.example.demo.repository.EmployeeDao;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {
	@Autowired
	private EmployeeDao employeeDao;
	
		//url : http://localhost:8085/employees/
	@GetMapping(path="/",produces = "application/json")
	public Employees getEmployees() {
		return employeeDao.getAllEmployees();
	}
	
	
	
	//url : http://localhost:8085/employees/2
	@GetMapping(path="/{id}",produces = "application/json")
	public Employee getEmployees(@PathVariable("id")int id) {
		return employeeDao.getEmployee(id);
	}
}
