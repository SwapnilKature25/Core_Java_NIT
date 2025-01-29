package com.nit.multithreading.assignments.mcq;

public class Problem11 extends Thread
{
public static void main(String argv[])
{
	Problem11 b = new Problem11();
	b.run();
	b.start();
} 
public void run()
{
for (int i = 0; i < 10; i++)
{
System.out.println("Value of i = " + i); 
}  
}
}
