package com.nit.multithreading;

class DoStuff extends Thread
{
	@Override
	public void run()
	{
		Thread t=Thread.currentThread();
		System.out.println("Running thread name is : "+t.getName());
	}
}

public class ThreadName {
	public static void main(String[] args) {
		// We are not providing the user-defined names so by default the name of thread would be Thread-0, Thread-1.
//		DoStuff t1=new DoStuff();
//		DoStuff t2=new DoStuff();
//		t1.start();
//		t2.start();
//		
//		System.out.println(Thread.currentThread().getName()+" thread is running...");

	
		
		
//		Note : Here we are providing the user-defined name i.e child1 and child2 for both the user-defined thread.
		Thread t=Thread.currentThread();
		t.setName("Parent");
		
		DoStuff t1=new DoStuff();
		DoStuff t2=new DoStuff();
		
		t1.setName("Child1");
		t2.setName("Child2");
		
		t1.start();
		t2.start();
		
		System.out.println(Thread.currentThread().getName()+" thread is running...");
	
//		Parent thread is running...
//		Running thread name is : Child1
//		Running thread name is : Child2
		
	}
}
 