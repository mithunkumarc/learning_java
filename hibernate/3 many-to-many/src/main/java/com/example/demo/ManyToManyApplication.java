package com.example.demo;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.model.*;
import com.example.demo.repository.BookRepository;
import com.example.demo.repository.PublisherRepository;

@SpringBootApplication
public class ManyToManyApplication implements CommandLineRunner {
	
	@Autowired
    BookRepository bookRepository;
	@Autowired
	PublisherRepository publisherRepository;

    public static void main(String[] args) {
        SpringApplication.run(ManyToManyApplication.class, args);
    }

    //important : transactional
    @Transactional
    @Override
    public void run(String...args) {
        // Create a couple of Book and Publisher
    	var publisher_a = new Publisher("Publisher A");
    	var publisher_b = new Publisher("Publisher B");
        var book1 = new Book("Book 1", publisher_a , publisher_b);
        
        
        
    	bookRepository.save(book1);
        
    	//dont reuse publisher_a and publisher_b , they have detached now, (dont remembered by hibernate)
    	var get_pub_a = publisherRepository.getOne(1);//add new book for existing publisher 
    	var get_pub_b = publisherRepository.getOne(2);
    	System.out.println(get_pub_a.getName());
    	System.out.println(get_pub_b.getName());
    	var book2 = new Book("Book 2", get_pub_a , get_pub_b);
    	
    	bookRepository.save(book2);
    }

}
