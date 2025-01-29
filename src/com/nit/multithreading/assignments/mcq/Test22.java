package com.nit.multithreading.assignments.mcq;

class Test22 
{
	public static void main(String[] args) 
	{		
		try
		{
			Problem8 h = new Problem8();
			Thread t1= new Thread(h,"MyHorse");
			Thread t2= new Thread(h,"YourHorse");
			new Test22().go(t2);
			t1.start(); 
			t2.start();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

				
	}
	void go(Thread t)
	{
		t.start();
	}
	
}


class Problem8 implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" ");
	}
}



/* java.lang.IllegalThreadStateException
YourHorse 
MyHorse 


YourHorse 
MyHorse 
java.lang.IllegalThreadStateException


 */