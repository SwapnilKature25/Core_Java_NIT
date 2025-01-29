package com.nit.multithreading.assignments.Day3;

class TestDemo extends Thread
{
	int a;
	public void run() {
		a++;
	}
}
public class Test3
{
	public static void main(String[] args) {
		TestDemo test = new TestDemo();
		test.run();
		System.out.println(test.a);
		test.start();
		System.out.println(test.a);
		System.out.println(test.isAlive());
		System.out.println(test.getName());		
	}
}

/* 
1
1
true
Thread-0
 */

