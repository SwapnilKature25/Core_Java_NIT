package com.nit.multithreading.assignments.Day3;

 
class TestCase2 implements Runnable
{
	public void run() {
		Thread thread = Thread.currentThread();
		Thread nit = thread.currentThread();
		System.out.println(nit.getName());	// Thread-0	
	}
}
public class Test15
{
	public static void main(String[] args) {
		TestCase2 nit = new TestCase2();
		Thread thread = new Thread(nit);
		thread.start();	
	}
}
