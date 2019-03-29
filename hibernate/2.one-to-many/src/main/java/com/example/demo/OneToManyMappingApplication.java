package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.repository.BookCategoryRepository;
import com.example.demo.model.Book;
import com.example.demo.model.BookCategory;

@SpringBootApplication
public class OneToManyMappingApplication implements CommandLineRunner {
	
	@Autowired
    BookCategoryRepository bookCategoryRepository;

    public static void main(String[] args) {
        SpringApplication.run(OneToManyMappingApplication.class, args);
    }

    @Override
    public void run(String...args) {
        // Create a couple of Book and BookCategory
        bookCategoryRepository.save(new BookCategory("Category 1", new Book("green book"), new Book("yellow book")));
    }

}
