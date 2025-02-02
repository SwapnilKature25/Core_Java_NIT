package com.nit.multithreading.assignments.day5;

public class NormalPriority extends Thread {
	@Override
	public void run()
	{
		for(int i=1; i <= 5 ; i++)
		{
            System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority());
			Thread.yield();   // Yielding to allow other threads to execute
		}
	}
}
