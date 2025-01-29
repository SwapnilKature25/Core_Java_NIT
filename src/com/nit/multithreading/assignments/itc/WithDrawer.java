package com.nit.multithreading.assignments.itc;

public class WithDrawer extends Thread
{
	private Account account;
	public WithDrawer(Account account)
	{
		this.account=account;
	}
	
	@Override
	public void run()
	{
		int[] withd = {5000,2000,1000};
		for(int withdrawls : withd)
		{
			account.withdraw(withdrawls);
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
