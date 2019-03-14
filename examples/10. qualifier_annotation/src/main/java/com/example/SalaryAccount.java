package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SalaryAccount {
	BankAccount bankAccount;
	
	
	//qualifer can be replaced by @primary
	//remove @qualifer mark either hdfc or icici as @primary to solve dependency conflict	
	
	
	@Autowired
	@Qualifier("hdfc")//or @Qualifier("icici")
	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
	public void getBalance() {
		this.bankAccount.getSalary();
	}
}
