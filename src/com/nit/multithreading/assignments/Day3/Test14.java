package com.nit.multithreading.assignments.Day3;


class TestCase implements Runnable
{
	public void run() {
		Thread thread = Thread.currentThread();
		Thread nit = thread.currentThread();
		System.out.println(nit.getName());		
	}
}
public class Test14
{
	public static void main(String[] args) {
		TestCase nit = new TestCase();
		Thread thread = new Thread(nit);
//		thread.start();// if start then Thread-0 otherwise no output
	}
}

