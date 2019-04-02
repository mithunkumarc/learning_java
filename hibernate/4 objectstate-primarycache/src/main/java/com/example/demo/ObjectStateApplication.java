package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import com.example.demo.model.Address;
import com.example.demo.repository.AddressRepository;

@SpringBootApplication
public class ObjectStateApplication implements CommandLineRunner{
	
	@Autowired 	
	AddressRepository addressRepository;

	EntityManagerFactory entityManagerFactory; 
	static ConfigurableApplicationContext context;
	public static void main(String[] args) {
		SpringApplication.run(ObjectStateApplication.class, args);
	}
	
    
	
	@Override
    public void run(String... args) {        
		
		/*  test object state first, uncomment below function call */
		
    	//this.testObjectState();
		
		
		
		/* test primary cache , uncomment below function call, comment testObjectState() above*/
		this.testPrimaryCache();
		
		
	}
	
	
	
	
	
	
	

	
	public void testPrimaryCache() {
		//even though we are requesting same data thrice
		//hibernate hits database only one
		//check log in console, you should see select query once
		//enable lazyloading
		//spring.jpa.properties.hibernate.enable_lazy_load_no_trans=true
		Address address = addressRepository.getOne(2);//stored in primary cache
		Address address1 = addressRepository.getOne(2);//uses primary cache
		Address address2 = addressRepository.getOne(2);//uses primary cache
		System.out.println(address.toString());
	}
	
	
	public void testObjectState() {
		
		//transition state : before persistance context
        var a1 = new Address("Street 1", "Zip 1");
        var a2 = new Address("Street 2", "Zip 2");
        
        //persistance state starts
        addressRepository.save(a1);//session opens and closes
        addressRepository.save(a2);//session opens and closes
        
        
        //detached
        //session closed : but still object can have id
        System.out.println(a1.getId());// prints id 
        System.out.println(a2.getId());
        
        //removed
        //default constructor is needed
        addressRepository.delete(a1);
        //a1 is removed now
	}


}
/*
 * 
 * 

transient

    the entity has just been instantiated and is not associated with a persistence context. It has no persistent representation in the database and typically no identifier value has been assigned (unless the assigned generator was used).


managed, or persistent

    the entity has an associated identifier and is associated with a persistence context. It may or may not physically exist in the database yet.


detached

    the entity has an associated identifier but is no longer associated with a persistence context (usually because the persistence context was closed or the instance was evicted from the context)

removed

    the entity has an associated identifier and is associated with a persistence context, however, it is scheduled for removal from the database.


 * 
 * 
 * 
 * */




