package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.service.EmployeeService;

@SpringBootApplication
public class ComponentScanApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComponentScanApplication.class, args);
		AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfig.class);
	      EmployeeService service1 = context1.getBean(EmployeeService.class);
	      service1.doSomething();
	}

}

