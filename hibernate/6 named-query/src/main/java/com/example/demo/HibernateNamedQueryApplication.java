package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateNamedQueryApplication implements CommandLineRunner {
	
	@Autowired
	EmployeeRepository employeeRepository;

	public static void main(String[] args)  {
		SpringApplication.run(HibernateNamedQueryApplication.class, args);
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		/*run for inserting*/
		/*
		Employee e1 = new Employee("vinay","mk","vinay@email.com",25,12000);
		Employee e2 = new Employee("anil","m","anil@email.com",26,12000);
		Employee e3 = new Employee("sunil","gc","sunil@email.com",27,12000);
		Employee e4 = new Employee("gowda","b","gowda@email.com",28,12000);
		Employee e5 = new Employee("pramod","m","pramod@email.com",29,12000);
		employeeRepository.save(e1);
		employeeRepository.save(e2);
		employeeRepository.save(e3);
		employeeRepository.save(e4);
		employeeRepository.save(e5);
		*/
	
		List<Employee> emplist = employeeRepository.fetchByLastNameLength(2L);
		emplist.forEach(emp -> System.out.println(emp.getFirstName() +":"+emp.getLastname()));
		
		
		
		//output :
		//vinay:mk
		//sunil:gc
		
		
		
	}

}
