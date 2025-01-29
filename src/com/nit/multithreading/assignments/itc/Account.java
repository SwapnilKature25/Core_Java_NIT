package com.nit.multithreading.assignments.itc;

public class Account {
	private int balance = 0;
	
	public synchronized void withdraw(int amount)
	{
		while(amount > balance)
		{
//			System.out.println("Insufficient amount!! Please Deposit First");
			try {
				wait();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
		balance-=amount;
		System.out.println(amount+" Successfully withdrawn "+"| Remaining Balance : "+this.balance);
		notify();
	}
	
	public synchronized void deposit(int amount)
	{
		balance+=amount;
		System.out.println(amount+" Successfully Deposited "+"| Total Balance : "+this.balance);
		notify();
	}
}
