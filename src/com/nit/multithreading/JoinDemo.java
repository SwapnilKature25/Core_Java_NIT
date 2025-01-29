package com.nit.multithreading;


class Join extends Thread
{
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		for(int i=1; i<=5; i++)
		{
			System.out.println("i value is :"+i+" by "+name);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println(name+ "Thread is dead now");
	}
}

public class JoinDemo 
{
	public static void main(String[] args) throws InterruptedException  
	{
		System.out.println("Main Thread started");
		
		Join j1 = new Join();		
		Join j2 = new Join();
		Join j3 = new Join();
		
		j1.setName("J1");
		j2.setName("J2");
		j3.setName("J3");
		
		j1.start();
		j1.join();
		System.out.println("Main Thread wake up");
		j2.start();
		j3.start();
		
		System.out.println("Main Thread Completed");
		
	}

}


