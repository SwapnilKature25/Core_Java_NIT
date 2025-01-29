package com.nit.multithreading.assignments.mcq2;


class TestSync
{
	void display(int a) throws InterruptedException {
		synchronized (this) {
			System.out.println(a*5);	// 1*5 = 5
			Thread.sleep(500);
		}
	}
}

class NIT77 extends Thread
{
	TestSync test;
	@Override
	public void run() {
		try {
			test.display(Thread.MIN_PRIORITY);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public NIT77(TestSync test) {
		this.test = test;
	}
}
class NIT88 extends Thread
{
	TestSync test;
	@Override
	public void run() {
		try {
			test.display(MIN_PRIORITY);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public NIT88(TestSync test) {
		this.test = test;
	}
}

public class Problem13 {
	
	public static void main(String[] args) throws InterruptedException {
		TestSync test = new TestSync();
		NIT77 nit = new NIT77(test);
		NIT88 nit1 = new NIT88(test);
		
		nit.start();
		nit1.start();
    }
}

// 5
// 5
