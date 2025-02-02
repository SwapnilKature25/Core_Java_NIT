package com.nit.multithreading.assignments.day5;

public class ThreadB extends Thread{
	public void run()
	{
		System.out.println(Thread.currentThread().getName() +" started in Thread B");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
