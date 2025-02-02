package com.nit.multithreading.threadPriority;


class Priority extends Thread
{
	@Override
	public void run()
	{
		int count = 0;
		for(int i = 1; i<=1000000; i++)
		{
			count++;
		}
		
		int priority = Thread.currentThread().getPriority();
		String name = Thread.currentThread().getName();
		
		System.out.println("The priority is :"+priority+" and thread name is :"+name);
		
	}
}

public class PriorityDemo2
{
	public static void main(String[] args)
	{
		Priority p1 = new Priority();
		Priority p2 = new Priority();
		
		p1.setPriority(Thread.MIN_PRIORITY);
		p2.setPriority(Thread.MAX_PRIORITY);
		
		p1.setName("Last");
		p2.setName("First");
		
		p1.start();  p2.start();
		
	}

}

// The priority is :10 and thread name is :First
//The priority is :1 and thread name is :Last

