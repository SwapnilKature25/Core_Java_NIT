package com.nit.multithreading.assignments.Day3;

class TestS implements Runnable
{
	@Override
	public void run() {
		Thread thread = Thread.currentThread();
		thread.stop();		// it will stop the thread
		System.out.println(thread.getState());
	}
}
public class Test13
{
	public static void main(String[] args) {
		TestS nit = new TestS();
		nit.run();
	}
}

// no output