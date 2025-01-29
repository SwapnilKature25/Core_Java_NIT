package com.nit.multithreading;

class Sleep2 extends Thread
{
	public void run()
	{
		System.out.println("Child thread id is : "+Thread.currentThread().getId());
		
		for(int i=1; i<=10; i++)
		{
			System.out.println("i value is :"+i);
			
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.err.println("Thread has Interrupted");
			}
		}
	}
}
public class ThreadSleep2 {

	public static void main(String[] args) {
		System.out.println("Main Thread id is : "+Thread.currentThread().getId());
		Sleep2 s1=new Sleep2();
		Sleep2 s2=new Sleep2();
		s1.start();
		s2.start();

	}

}
