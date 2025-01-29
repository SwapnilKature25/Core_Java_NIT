package com.nit.multithreading;

public class AnonymousThreadWithoutReference {
	public static void main(String[] args) {
		new Thread()
		{
			@Override
			public void run()
			{
				System.out.println(Thread.currentThread().getName() +" thread runninh here..");
			}
		}.start();
		String name=Thread.currentThread().getName();
		System.out.println(name);
		
	}
}	
