package com.nit.multithreading.threadPriority;

class Test implements Runnable
{
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		
		for(int i=1; i<=10; i++)  
		{
			System.out.println(i+" by "+name+ " thread");
			
			if(name.equals("Child1"))
			{
				Thread.yield();  //give a chance to child2
			}
			
		}	
	}
}

public class YieldDemo {

	public static void main(String[] args) 
	{
		Test t1 = new Test();
		
		Thread child1 = new Thread(t1, "Child1");
		Thread child2 = new Thread(t1, "Child2");
		
		child1.start();  child2.start();

	}

}