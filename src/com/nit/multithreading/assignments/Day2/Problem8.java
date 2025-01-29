package com.nit.multithreading.assignments.Day2;


class MyThread2 extends Thread
{
	String myName;

	MyThread2(String name)
	{
		myName = name;
	}

	public void run()
	{
		for(int i=0; i<10;i++)
		{
			System.out.println(myName);
		}
	}
}
public class Problem8
{
	public static void main(String args[])
	{
		try
		{
			MyThread2 mt1 = new MyThread2("mt1");
			MyThread2 mt2 = new MyThread2("mt2");
			mt1.start();
			mt1.join();
			mt2.start();
		}
		catch(InterruptedException ex)
		{
		}
	}
}

