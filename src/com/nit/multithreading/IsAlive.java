package com.nit.multithreading;

class Method extends Thread
{
	@Override 
	public void run()
	{
		System.out.println("Thread-0 started");
	}
}
public class IsAlive {
	public static void main(String[] args) 
	{
		System.out.println("Main thread started");
		Method m=new Method();
		System.out.println("Thread-0 is Alive Before start() : "+m.isAlive());
		m.start();
//		t.start();		// we can't restart same thread => Exception in thread "main" java.lang.IllegalThreadStateException
		System.out.println("Thread-0 is Alive After start() : "+m.isAlive());
		System.out.println("Main thread Ended");
		
	}
}
