package com.nit.multithreading.assignments.Day3;


class TestCase3 implements Runnable
{
	public void run() {
		Thread thread = Thread.currentThread();
		Thread nit = thread.currentThread();
		System.out.println(nit.getName());
				
	}
}
public class Test16
{
	public static void main(String[] args) {
		TestCase3 nit = new TestCase3();
		Thread thread = new Thread(nit);
		thread.setName("NareshIT");
		thread.start();
		
		Thread nit2 = new Thread();
		System.out.println(nit2.MIN_PRIORITY+" "+
		nit2.MAX_PRIORITY+" "+nit2.NORM_PRIORITY);	// 1 10 5
	}

}

