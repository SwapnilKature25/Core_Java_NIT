package com.nit.multithreading;

class Demo1 implements Runnable
{
	@Override
	public void run() 
	{
		System.out.println("Thread is Running");		
	}	
}

public class RunnableDemo
{
   public static void main(String [] args)
   {
	   System.out.println("Main");
	  Demo1 d = new Demo1();
	  Thread t1 = new Thread(d);
	  t1.start();
   }
}   
