package com.nit.multithreading.assignments.day5;

public class ThreadA extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName() +" started in Thread A");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
