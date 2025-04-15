package com.nit.multithreading.itc;

class Foo implements Runnable
{
	@Override
	public void run() 
	{
		String name = Thread.currentThread().getName();
	    for(int i=1; i<=3; i++)
	    {
	    	System.out.println("i value is :"+i+" by "+name+ " thread");
	    	try
	    	{
	    		Thread.sleep(500);
	    	}
	    	catch(InterruptedException e)
	    	{
	    		e.printStackTrace();
	    	}
	    }
		
	}	
}
 
public class ThreadGroupDemo1 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  
	 ThreadGroup tg = new ThreadGroup("Batch 39");
	 
	 Thread t1 = new Thread(tg, new Foo(), "Scott");
	 Thread t2 = new Thread(tg, new Foo(), "Smith");
	 Thread t3 = new Thread(tg, new Foo(), "Alen");
	 Thread t4 = new Thread(tg, new Foo(), "John");
	 Thread t5 = new Thread(tg, new Foo(), "Martin");
	 
	 t1.start();
	 t2.start();
	 t3.start();
	 t4.start();
	 t5.start();
	 
	 //Thread.sleep(5000);
	 
	System.out.println("How many threads are active under Batch 39 group :"+tg.activeCount());
	 
	System.out.println("Name of the the Group is :"+tg.getName());
	 
  }
}