package com.nit.multithreading.assignments.day5;

public class HighPriority extends Thread {
	
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.MAX_PRIORITY);
	}
}
