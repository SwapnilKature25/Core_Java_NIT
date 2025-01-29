package com.nit.multithreading.assignments.mcq2;


class TestSync1
{
	public static synchronized void display(String name) {
		System.out.println("Congratulations Mr/Mrs "+name);
	}
}

class NIT13 extends Thread
{
	
	TestSync1 test;
	String name;
	
	public NIT13(TestSync1 test, String name) {
		this.test = test;
		this.name = name;
	}
	@Override
	public void run() {
		test.display(name);
	}
	
}


public class Problem14 {
	
	public static void main(String[] args) throws InterruptedException {
		TestSync1 test = new TestSync1();
		NIT13 nit = new NIT13(test,"Naresh");
		NIT13 nit1 = new NIT13(test,"Ravi");
		nit.start();
		nit1.start();
    }
}

/* Congratulations Mr/Mrs Naresh
Congratulations Mr/Mrs Ravi */
