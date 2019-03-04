package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMongodbApplication implements CommandLineRunner{
	
	@Autowired
	private CustomerRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongodbApplication.class, args);
	}
	
	
	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll();

		// save a couple of customers
		repository.save(new Customer("Alice", "Smith"));
		repository.save(new Customer("Bob", "Smith"));

		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Customer customer : repository.findAll()) {
			System.out.println(customer);
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("Customer found with findByFirstName('Alice'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByFirstName("Alice"));

		System.out.println("Customers found with findByLastName('Smith'):");
		System.out.println("--------------------------------");
		for (Customer customer : repository.findByLastName("Smith")) {
			
			System.out.println(customer);
		}
		
		//update : refresh db to see result
		if(repository.findByFirstName("Alice").firstName.equals("Alice")) {
			//to make this work, this is for demo, use id for update 
			var entity = repository.findByFirstName("Alice");//make sure you have one document named alice
			entity.firstName = "Regina";
			repository.save(entity);
		}
		
		//after update  :changing name
		System.out.println(repository.findByFirstName("Regina"));

		//for delete
		//repository.deleteById(id);
		

	}

}
