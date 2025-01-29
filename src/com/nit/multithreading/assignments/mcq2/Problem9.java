package com.nit.multithreading.assignments.mcq2;

class NIT12 extends Thread
{
	@Override
	public void run() {
		System.out.println(currentThread().getId());
		System.out.println(currentThread().getName());
		System.out.println(currentThread().getPriority());
	}
}

public class Problem9 {
	
	public static void main(String[] args) throws InterruptedException {
		NIT12 nit = new NIT12();
		NIT12 nit1 = new NIT12();
		NIT12 nit2 = new NIT12();
		nit.start();
		nit1.start();
		nit2.start();
    }
}

