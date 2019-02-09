package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class DemorunnerApplication {

	public static void main(String[] args) {
		System.out.println("The service to start.");
		SpringApplication.run(DemorunnerApplication.class, args);
		System.out.println("The service has started.");
	}

}

