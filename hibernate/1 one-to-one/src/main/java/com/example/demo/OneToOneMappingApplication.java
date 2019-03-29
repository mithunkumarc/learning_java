package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Address;
import com.example.demo.model.Library;
import com.example.demo.repository.LibraryRepository;

//@Configuration //optional
@SpringBootApplication
public class OneToOneMappingApplication implements CommandLineRunner{

	 @Autowired 	
	 private LibraryRepository libraryRepository;

	    public static void main(String[] args) {
	        SpringApplication.run(OneToOneMappingApplication.class, args);
	    }

	    @Override
	    public void run(String... args) {
	        // Create a couple of Library and Address
	        libraryRepository.save(new Library("Library 1", new Address("Street 1", "Zip 1")));
	        libraryRepository.save(new Library("Library 2", new Address("Street 2", "Zip 2")));
	}
}
