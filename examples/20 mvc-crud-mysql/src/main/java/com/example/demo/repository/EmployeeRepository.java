package com.example.demo.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	//adding one more method on top of crud methods
    List<Employee> findByNameContaining(String q);

}