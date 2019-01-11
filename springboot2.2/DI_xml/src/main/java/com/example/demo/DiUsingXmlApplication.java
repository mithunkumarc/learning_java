package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DiUsingXmlApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiUsingXmlApplication.class, args);
		ApplicationContext context=new ClassPathXmlApplicationContext("beans1.xml");	      
	    GeometryExample1 geometryBean1=context.getBean("geometryExample1", GeometryExample1.class);
	    geometryBean1.drawShape();
	}
	
}

