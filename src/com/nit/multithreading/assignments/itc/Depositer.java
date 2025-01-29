package com.nit.multithreading.assignments.itc;

public class Depositer extends Thread
{
	private Account account;

	public Depositer(Account account) {
		super();
		this.account = account;
	}
	
	@Override
	public void run()
	{
		int[] deposit= {10000,2000,5000}; 
		for(int deposits : deposit)
		{
			account.deposit(deposits);
			try {
				sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	
}
