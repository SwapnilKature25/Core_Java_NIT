package com.nit.multithreading.practice.test2;

public class Withdrawer extends Thread{
	private Account acc;
	
	public Withdrawer(Account acc)
	{
		this.acc=acc;
	}
	
	@Override
	public void run()
	{
		int wtd[]= {3000,10000,15000};
		for(int w : wtd)
		{
			acc.withdraw(w);
			try
			{
				sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
