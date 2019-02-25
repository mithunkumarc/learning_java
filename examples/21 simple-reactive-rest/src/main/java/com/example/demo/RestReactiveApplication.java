package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestReactiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestReactiveApplication.class, args);
		
	}
	//request : received by router
	//routed to handler
	//handler handles request with response
}
