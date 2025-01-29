package com.nit.interfaces;

interface Bank
{
	void deposit(double amount);
	void withdraw(double amount);
}
class Customer implements Bank
{
	double balance;

	public Customer(double balance) 
	{
		super();
		this.balance = balance;
	}

	@Override
	public void deposit(double amount) 
	{
		if(amount<=0)
		{
		   System.err.println("deposit is not possible");	
		}
		else
		{
			this.balance = this.balance + amount;
			System.out.println("After deposit amount is :"+this.balance);
		}
	}

	@Override
	public void withdraw(double amount) 
	{
		if(amount > this.balance)
		{
			System.err.println("Insufficient Balance");
		}
		else
		{
			this.balance = this.balance - amount;
			System.out.println("Balance after withdraw is :"+this.balance);
		}
		
	}
}

public class InterfaceDemo
{
	public static void main(String[] args) 
	{
		Bank b = new Customer(10000);
		b.deposit(10000);
		b.withdraw(5000);
	}

}