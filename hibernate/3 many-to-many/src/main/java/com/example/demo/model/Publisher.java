package com.example.demo.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;


   public Publisher() {
	   
   }
    
    @ManyToMany(mappedBy = "publishers",fetch=FetchType.LAZY)
    private Set<Book> books = new HashSet<>();

    public Publisher(String name) {
        this.name = name;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.getName().length() + this.id;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		Publisher publisher = (Publisher)obj;
		return this.name.equals(publisher.name) && this.id == publisher.id;
	}
	
	
	
	
	
	
	
	
	
    
    
}
