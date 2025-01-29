package com.nit.multithreading.assignments.Day3;

public class Test4 extends Thread
{
	public void run() {
		System.out.println(Thread.currentThread().getId());
	}
	public static void main(String[] args) {
		Test4 nit = new Test4();
		for(int i=0;i<10;i++)
		{
			nit.start();
		}
		// IllegalThreadStateException => Because we can't start/create thread twice
	}
}

// 21
//Exception in thread "main" java.lang.IllegalThreadStateException