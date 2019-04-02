package com.example.demo.model;

import javax.persistence.*;


@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String street;

    private String zipCode;

    
    public Address(String street, String zipCode) {
        this.street = street;
        this.zipCode = zipCode;
    }
    
    public Address() {
    	
    }


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getZipCode() {
		return zipCode;
	}


	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + ":" + this.street + ":"+this.zipCode;
	}    
    
}
