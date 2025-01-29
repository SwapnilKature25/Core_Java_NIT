package com.nit.multithreading.assignments.Day3;

 
public class Test10 extends Thread
{	
	public static void main(String[] args) {
		Test10 m1 = new Test10();
		Test10 m2 = new Test10();
		Test10 m3 = new Test10();
		m1.start();
		m2.start();
		m3.start();
		m1.start(); // java.lang.IllegalThreadStateException
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
