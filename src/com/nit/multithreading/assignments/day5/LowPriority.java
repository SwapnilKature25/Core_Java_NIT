package com.nit.multithreading.assignments.day5;

public class LowPriority extends Thread{
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.MIN_PRIORITY);
	}
}
