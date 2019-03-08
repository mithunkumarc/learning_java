package com.example.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggingApplication implements CommandLineRunner {
	final Logger log = LoggerFactory.getLogger(this.getClass());
	public static void main(String[] args) {
		SpringApplication.run(LoggingApplication.class, args);
		
	}
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		log.trace("this is trace message");
		log.debug("this is debug message");
		log.info("this is info message");
		log.warn("this is warning message");
		log.error("this is error message");
		
	}

}
