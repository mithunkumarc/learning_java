package com.example.demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		ApplicationContext context=new ClassPathXmlApplicationContext("beans1.xml");	      
	      GeometryExample1 geometryBean1=context.getBean("geometryExample1", GeometryExample1.class);
	      geometryBean1.drawShape();
	}
}

