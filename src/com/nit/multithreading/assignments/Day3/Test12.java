package com.nit.multithreading.assignments.Day3;


class TestD implements Runnable {
	@Override
	public void run() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getState());
	}
}

public class Test12 {
	public static void main(String[] args) {
		TestD nit = new TestD();
		nit.run(); // THread state is Runnable
//		Thread t=new Thread(nit);
//		t.start();		// THread state is Runnable
	}
}

// The state RUNNABLE does not distinguish between a thread that is actively running and one that is ready to run (but not currently running). Both are categorized as RUNNABLE.
//RUNNABLE
