package com.nit.multithreading.assignments.day5;

public class NormalPriority extends Thread {
	@Override
	public void run()
	{
		Thread.yield();
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.NORM_PRIORITY);
	}
}
