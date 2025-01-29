package com.nit.exception.bankApplication;

public class Customer {
	private String name;
	private BankAccount account;
	
	public Customer(BankAccount account,String name)
	{
		this.account=account;
		this.name=name;
	}
	
	public void getAccount()
	{
		System.out.println("Customer Account : "+account);
	}
	
	
}
