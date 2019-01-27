package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.AppConfig;
import com.example.spel.Arithmetic;
import com.example.spel.Logical;
import com.example.spel.Relational;

@SpringBootApplication
public class ExpressionLanguageApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpressionLanguageApplication.class, args);
		AnnotationConfigApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppConfig.class);
        
        //uncomment and run one by one to see the result
        
        //set prop of object using arithmetic operators
        Arithmetic arithmetic = (Arithmetic) context.getBean(Arithmetic.class);
        System.out.println(arithmetic);
        
        //set prop of object using logical operators
        Logical logical = (Logical) context.getBean(Logical.class);
        System.out.println(logical);
        
        //set prop of object using relational operators
        Relational relational = (Relational)context.getBean(Relational.class);
        System.out.println(relational);
        
        
        
        
        
        
	}

}

