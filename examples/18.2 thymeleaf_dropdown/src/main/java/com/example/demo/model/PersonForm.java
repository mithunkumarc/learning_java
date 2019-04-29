package com.example.demo.model;

public class PersonForm {
	private String countryId;
	
	public PersonForm() {
		
	}
	public PersonForm(String countryId){
		this.countryId = countryId;
	}
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	
	
}
