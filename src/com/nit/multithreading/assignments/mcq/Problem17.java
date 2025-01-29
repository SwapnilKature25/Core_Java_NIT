package com.nit.multithreading.assignments.mcq;


class MyThread extends Thread 
{
public void run() 
{
		for (int i=0; i < 10; i++) 
		{
			System.out.println("hello world1");
		}
	}
}
public class Problem17
{
public static void main(String [] args) 
{
MyThread t1 = new MyThread();
t1.start();
try 
{
t1.join(); 
} 
catch (InterruptedException e) 
{
System.out.println("ERROR: Thread was interrupted");
}       
System.out.println("Thread is done!");
	}
}

/* hello world1
hello world1
hello world1
hello world1
hello world1
hello world1
hello world1
hello world1
hello world1
hello world1
Thread is done!
*/