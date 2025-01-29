package com.nit.multithreading;
// Case 1: Creating Anonymous inner class object using Thread class with ref.

public class AnonymousThreadWithReference {
	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread()
		{
			@Override
			public void run()
			{
				String name=Thread.currentThread().getName();
				System.out.println(name + " thread is running here...");
			}
		};
		t1.start();
		String name=Thread.currentThread().getName();
		System.out.println("Currently executing thread is : "+name);
	}
}
