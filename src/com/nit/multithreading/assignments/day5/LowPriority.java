package com.nit.multithreading.assignments.day5;

public class LowPriority extends Thread{
	@Override
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
            System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority());
		}
	}
}
