package com.nit.multithreading.assignments.Day3;

class Test extends Thread
{
	@Override
	public void run() {
		System.out.println("Run");
		super.run();
	}
	
	@Override
	public synchronized void start() {
		System.out.println("Start");
		super.start();
	}	
}
public class Test2
{
	public static void main(String[] args) {
		nit();
	}
	
	static public void nit() {
		Test test = new Test();
		test.start();
	}
}

// Start
// run
