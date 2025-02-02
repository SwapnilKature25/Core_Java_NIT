package com.nit.multithreading.assignments.day5;

public class HighPriority extends Thread {
	
	@Override
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
//			System.out.print(Thread.currentThread().getName());
//			System.out.println("\tPriority : "+Thread.currentThread().getPriority());
            System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority());
		}
		
	}
}
