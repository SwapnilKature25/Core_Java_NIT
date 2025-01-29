package com.nit.multithreading.practice.test2;

public class Depsiter extends Thread{
	private Account acc;
	
	public Depsiter(Account acc)
	{
		this.acc=acc;
	}
	
	@Override
	public void run()
	{
		int deposits[]= {10000,5000,3000};
		for(int deposit : deposits)
		{
			acc.deposit(deposit);
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
