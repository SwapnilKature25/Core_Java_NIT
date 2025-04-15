package com.nit.multithreading.itc;
// //Program on ITC where son can withdraw the amount and father
//can deposit the amount.

class Customer
{
	private double balance = 10000;
	
	public synchronized void withdraw(double amount) 
	{
		System.out.println("Son is going to withdraw...");  // 1
		
		if(amount > balance)
		{
			System.out.println("Less amount, Waiting for deposit..");  //2 
			try
			{
				wait();  //lock is released
				System.out.println("Got Notification, Going for withdraw");  //5
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		this.balance = this.balance - amount;
		System.out.println("Amount after withdraw is :"+this.balance);  //6 
		
	}
	
	
	public synchronized void deposit(double amount)
	{
	   System.out.println("Going to deposit the amount...");  //3
	   this.balance = this.balance + amount;
	   System.out.println("Deposit Completed, Balance after deposit is :"+this.balance);  //4
	   notify();
	}
	
}

public class ITCDemo4 
{
	public static void main(String[] args)
	{
		Customer cust = new Customer();
		
		Thread son = new Thread()
		{
		   @Override
		   public void run()
		   {
			   cust.withdraw(15000);
		   }
		};
		
		son.start();
		
		Thread father = new Thread()
		{
		   @Override
		   public void run()
		   {
			   cust.deposit(10000);
		   }
		};			
		  
		father.start();
	}

}