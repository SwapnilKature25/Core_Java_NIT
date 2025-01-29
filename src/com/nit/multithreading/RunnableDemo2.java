package com.nit.multithreading;

//Assigning different Target by multiple thread :

class Tatkal implements Runnable
{
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		System.out.println(name+" is booking ticket under Tatkal Scheme");
	}	
}
class PremimumTatkal implements Runnable
{
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		System.out.println(name+" is booking ticket under PremimumTatkal Scheme");		
	}	
}

public class RunnableDemo2
{
	public static void main(String[] args) throws InterruptedException 
	{			
		Thread t2 = new Thread(new PremimumTatkal(),"Smith");
		t2.start();
			
		Thread t1 = new Thread(new Tatkal(),"Scott");
		t1.start();		
		
		Thread t3 = new Thread(new Tatkal(), "Martin");
		t3.start();
		
		
	}

}
