package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DiIntializePropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiIntializePropertiesApplication.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig1.class);
	      Circle circle = context.getBean(Circle.class);
	      circle.draw();
	      context.close();
	}

}

