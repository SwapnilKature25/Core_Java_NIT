package com.nit.multithreading.assignments.mcq;

public class Problem18 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Main thread started");
		Thread thread = Thread.currentThread();
		String name = thread.getName();
		System.out.println(name);
		for(int i=1; i<=5; i++)
		{			
			System.out.println(i + " by "+name+ " thread ");
			Thread.sleep(1000);
			thread.join(); 
		}		
		System.out.println("Main thread ended");
	}

}


/* Main thread started
main
1 by main thread 

The join() method tells the main thread to wait for the thread referenced by thread to finish execution before continuing.
Since thread is a reference to the main thread itself, it essentially makes the main thread wait for itself to complete. 
This causes a deadlock, as the main thread can never complete while it’s waiting for itself.

 */