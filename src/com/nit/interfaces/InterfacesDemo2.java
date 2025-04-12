package com.nit.interfaces;

interface Banks
{
	void deposit(double amount);
	void withdraw(double amount);
}
class Customers implements Banks
{
	double balance;

	public Customers(double balance) 
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

public class InterfacesDemo2 
{
	public static void main(String[] args) 
	{
		Banks b = new Customers(10000);
		b.deposit(10000);
		b.withdraw(5000);
	}

}
