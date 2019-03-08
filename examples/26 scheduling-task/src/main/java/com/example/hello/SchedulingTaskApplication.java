package com.example.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


//enable scheduling in appconfig.java with @configuration file
//or use beans.xml to enable scheduling

@SpringBootApplication
@EnableScheduling
public class SchedulingTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchedulingTaskApplication.class, args);
	}

}
