package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class QualifierAnnotaionApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(QualifierAnnotaionApplication.class, args);
		//AnnotationConfigApplicationContext context =
			//	new AnnotationConfigApplicationContext(AppConfig.class);
		SalaryAccount salaryAccount = context.getBean(SalaryAccount.class);
		salaryAccount.getBalance();
	}

}

