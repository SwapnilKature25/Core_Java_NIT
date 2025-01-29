package com.nit.multithreading.assignments.mcq2;

class NIT21 extends Thread
{
	@Override
	public void run() {
		System.out.println(currentThread().getName());
		System.out.println(currentThread().getPriority());
	}
}

public class Problem10 {
	
	public static void main(String[] args) throws InterruptedException {
		NIT21 nit = new NIT21();
		NIT21 nit1 = new NIT21();
		NIT21 nit2 = new NIT21();
		
		nit.setPriority(Thread.NORM_PRIORITY);
		nit1.setPriority(Thread.NORM_PRIORITY);
		nit2.setPriority(Thread.NORM_PRIORITY);
		
		nit.setPriority(Thread.MIN_PRIORITY);
		nit1.setPriority(Thread.MIN_PRIORITY);
		nit2.setPriority(Thread.MIN_PRIORITY);

		nit.setPriority(Thread.MAX_PRIORITY);
		nit1.setPriority(Thread.MAX_PRIORITY);
		nit2.setPriority(Thread.MAX_PRIORITY);	
		
		nit.start();
		nit1.start();
		nit2.start();
    }
}

