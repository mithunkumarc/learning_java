package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HibernateApplication {

	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(HibernateApplication.class, args);
		HibernateApplication hibernateApplication = context.getBean(HibernateApplication.class);
		
		//database :
		//create database users_database;
		//use users_database;

		/*
		//creating user
		User user1 = new User();
		user1.setFirstName("vishruth");
		user1.setLastName("jain");
		user1.setEmailId("jain.vishruth@gmail.com");
		
		
		User user2 = new User();
		user2.setFirstName("lalith");
		user2.setLastName("mk");
		user2.setEmailId("lalithmk12@gmail.com");
		
		User user3 = new User();
		user3.setFirstName("barath");
		user3.setLastName("ck");
		user3.setEmailId("ck.barath@gmail.com");
		
		hibernateApplication.createUser(user1);
		hibernateApplication.createUser(user2);
		hibernateApplication.createUser(user3);
		*/
		
		
		/*
		//reading records
		hibernateApplication.getAllUsers().forEach(user -> System.out.println(user.getFirstName() + ":" + user.getEmailId()));
		*/
		
		
		/*
		//reading single user
		Optional<User> optional_user = hibernateApplication.getUserById(2);
		User user2 = optional_user.get();
		System.out.println( user2.getFirstName() + ":" +   user2.getEmailId());
		*/
		
		
		/*
		//update user : id : 2
		User toBeUpdatedUser = new User();
		toBeUpdatedUser.setId(2);
		toBeUpdatedUser.setFirstName("lalith");// not updating
		toBeUpdatedUser.setLastName("mk");//not updating
		toBeUpdatedUser.setEmailId("contact_lalith@gmail.com");//updating field
		User updatedUser = hibernateApplication.updateUser(toBeUpdatedUser);
		System.out.println(updatedUser.getEmailId());
		*/
		
		
		/*
		//deleting user 3
		String message = hibernateApplication.deleteUser(3);//deleting barath
		System.out.println(message);
		*/
		
	}
	
	
	
	
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	
	public Optional<User> getUserById(long userId) {
		Optional<User> user = userRepository.findById(userId);
		return user;
	}

	
	public User createUser(User user) {
		return userRepository.save(user);
	}

	
	public User updateUser(User userDetails) {
		Optional<User> optional_user = userRepository.findById(userDetails.getId());
		User user = optional_user.get();
		user.setEmailId(userDetails.getEmailId());
		user.setLastName(userDetails.getLastName());
		user.setFirstName(userDetails.getFirstName());
		
		final User updatedUser = userRepository.save(user);
		return updatedUser;
	}

	
	public String deleteUser(long userId){
		Optional<User> optional_user = userRepository.findById(userId);
		userRepository.deleteById(userId);
		return "deleted : "+ optional_user.get().getFirstName().toString();
	}
	
	
	

}
