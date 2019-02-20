package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;


@ComponentScan("com.example.demo")
@SpringBootApplication
public class JdbcApplication {

	@Autowired
	ItemRepository itemRepository;
	
	public static void main(String[] args) {
		var context = SpringApplication.run(JdbcApplication.class, args);
		JdbcApplication jdbc = context.getBean(JdbcApplication.class);
		jdbc.add();
		jdbc.update();
		jdbc.delete();
		jdbc.read();
	}

	
	public void add() {
		itemRepository.addItem(1, "Mobile", "Electronics");
		itemRepository.addItem(2, "Sugar", "Groceries");
		itemRepository.addItem(3, "Bat", "Sports");
		itemRepository.addItem(4, "Chair", "Furniture");
		itemRepository.addItem(5, "Book", "Library");
	}
	
	public void update() {
		itemRepository.updateItem(5, "hammer", "tools");
	}
	
	public void delete() {
		itemRepository.deleteItem(2);
	}
	
	public void read() {
		itemRepository.getAllItems().forEach(item -> System.out.println(item.getName() + ":" + item.getCategory()));
	}
}

/*
 * 	sql : 
 * 
 * 	create database otp;
	
	use otp;
	
	CREATE TABLE `item` (
	  `id` INT(11) NULL DEFAULT NULL,
	  `name` VARCHAR(50) NULL DEFAULT NULL,
	  `category` VARCHAR(50) NULL DEFAULT NULL
	);

 * 
 * 
 * 
 * */

