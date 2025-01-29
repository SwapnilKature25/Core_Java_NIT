package com.nit.multithreading.assignments.Day3;
 

public class Test11 extends Thread
{	
	public static void main(String[] args) {
		Test11 m1 = new Test11();
		Test11 m2 = new Test11();
		Test11 m3 = new Test11();
		m1.start();
		m2.start();
		m3.start();
		
		for(int i=0;i<5;i++) 
		{
			m2.yield();
			System.out.println(Thread.currentThread().getName());
		}
	}
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

/* Thread-0
Thread-1
Thread-2
main
main
main
main
main
 */