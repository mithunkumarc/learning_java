package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DiAnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiAnnotationApplication.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	      Company company = context.getBean(Company.class);
	      company.showEmployeeInfo();
	      context.close();
	}

}

