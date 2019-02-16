package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class DiIntializeBeanApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	      Company company = context.getBean(Company.class);
	      company.showEmployeeInfo();
	      context.close();
	}

}

