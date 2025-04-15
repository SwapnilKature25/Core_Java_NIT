package com.nit.multithreading.itc;

class Demo extends Thread
{
	private int val = 0;
	
	@Override
	public void run()
	{
		//child thread will wait for Object lock
		synchronized(this)
		{
			System.out.println("Loop Started");
			for(int i=1; i<=10; i++)
			{				
				val = val + i;
			}
			System.out.println("Sending notification to main thread");
			notify();
			
		}
	}
	
	public int getVal()
	{
		return this.val;
	}	
}

public class ITCDemo3 {

	public static void main(String[] args) throws InterruptedException 
	{		
		Demo d1 = new Demo();
		d1.start();
		
				
		synchronized(d1)
		{
			//Suspended
			System.out.println("Waiting for child thread to complete");
			System.out.println("Lock is released");
			d1.wait();
			System.out.println("Main Thread wake up");
			System.out.println(d1.getVal());
		}
		
		
	}

}