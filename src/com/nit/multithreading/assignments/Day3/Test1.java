package com.nit.multithreading.assignments.Day3;

public class Test1 implements Runnable
{
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new Test1());
		thread.start();
		System.out.print("nit ");
		thread.join();
		System.out.println("google ");
	}
	@Override
	public void run() {
		System.out.println("NareshIT");
	}
}

//nit NareshIT
//google 