package com.nit.multithreading.assignments.mcq2;

class NIT extends Thread
{
	@Override
	public void run() {
		
		System.out.println("1st Thread");
	}
}

class NIT1 extends Thread
{
	@Override
	public void run() {
		
		System.out.println("2nd Thread");
	}
}

public class Problem2 {
	public static void main(String[] args) {
		NIT thread = new NIT();
		NIT1 thread1 = new NIT1();
		
		thread.start();
		System.out.println(thread.getPriority());
		System.out.println(thread.isAlive());
		System.out.println(thread1.isAlive());
		thread1.start();
		System.out.println(thread1.getPriority());
		
    }
}
