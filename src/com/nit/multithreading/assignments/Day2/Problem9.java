package com.nit.multithreading.assignments.Day2;


class MyThread3 implements Runnable
{
	String str;
	MyThread3(String str)
	{
		this.str=str;
	}
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(str+ " : "+i);
			try
			{
				Thread.sleep(100);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
public class Problem9
{
	public static void main(String [] args)
	{
	MyThread3 obj1 = new MyThread3("Cut the Ticket");
	MyThread3 obj2 = new MyThread3(" Show the Seat");

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		t2.start();

	}
}
