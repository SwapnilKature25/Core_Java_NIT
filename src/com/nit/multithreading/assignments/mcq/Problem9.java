package com.nit.multithreading.assignments.mcq;

class Parrot implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" ");
	}
}
class Problem9
{
	static Parrot p;	

	static {
//		System.out.println(p);
		p=new Parrot();
	}

	{	
		Thread t1= new Thread(p,"Peacock"); 		// peacock
		t1.start();	
	}

	public static void main(String [] args)
	{
		new Problem9();

		new Thread( new Runnable()
		{
			public void run()
			{
				System.out.println(Thread.currentThread().getName());  // koyal
			}
		},"Koyal").start();

		new Thread(new Parrot(),"Parrot").start();
	}
	

	{
	  Thread t2 = new Thread(p,"Sparrow");t2.start();
	}

	}


/* Peacock 
Sparrow 
Parrot   */