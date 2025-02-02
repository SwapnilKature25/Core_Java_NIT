package com.nit.multithreading.synchronization;

class ThreadName3
{
	public void printThreadName()
	{
		String name = Thread.currentThread().getName();
		System.out.println("Running Thread name is :"+name);
		
		synchronized(this)
		{
			System.out.println("Synchronized block started by thread :"+name);
			for(int i = 1; i<=10; i++)
			{
				System.out.println("i value is :"+i+" by "+name);
			}
			System.out.println("Synchronized block ended by thread :"+name);
		}
	}
}

public class BlockLevelSynchronization {

	public static void main(String[] args) 
	{
		ThreadName3 tn = new ThreadName3();
		
		Runnable r1 = ()-> tn.printThreadName();
		
		Thread t1 = new Thread(r1,"Child1");
		Thread t2 = new Thread(r1,"Child2");
		
		t1.start();  t2.start();

	}

}