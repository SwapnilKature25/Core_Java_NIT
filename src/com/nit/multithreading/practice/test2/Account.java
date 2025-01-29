package com.nit.multithreading.practice.test2;

/* Develop a program by using ITC, where two customers called Depositor and Drawer
will deposit and withdraw the money respectively from the ATM machine. */

public class Account {
	private int balance=0;
	
	public synchronized void deposit(int amt)
	{
		balance+=amt;
		System.out.println(amt+" successfully deposited  | Total Balance : "+this.balance);
		notify();
	}
	
	public synchronized void withdraw(int amt)
	{
		while(amt > balance)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		balance-=amt;
		System.out.println(amt + " successfully withdrawn | Remaining bal : "+this.balance);
	}
}
