package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


	/*
	 * default scope of bean is : singleton
	In Spring framework, we can manage lifecycle of a bean by using method-level annotations 
	@PostConstruct and @PreDestroy.
	The @PostConstruct annotation is used on a method that needs to be executed after 
	dependency injection is done to perform any initialization.
	The @PreDestroy annotation is used on methods as a callback notification to signal that 
	the instance is in the process of being removed by the container.
	The following examples demonstrate the use of @PostConstruct and @PreDestroy annotations.
	Consider the MailService bean, whose init() and destroy() methods are annotated with 
	@PostConstruct and @PreDestroy annotations respectively.
*/



@SpringBootApplication
public class LifeCycleBeanApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(LifeCycleBeanApplication.class, args);
		
		//AnnotationConfigApplicationContext context = 
	      //      new AnnotationConfigApplicationContext(AppConfig.class);
	      
	      
	      // Send mail 1
	      MailService mailService1 = context.getBean(MailService.class);
	      mailService1.send("user1@example.com");

	      // Send mail 2
	      MailService mailService2 = context.getBean(MailService.class);
	      mailService2.send("uesr2@example.com");

	      context.close();
	}

}

