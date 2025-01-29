package com.nit.multithreading.assignments.Day3;


public class Test8 implements Runnable
{
	Thread thread;
	public Test8() {
		thread = new Thread(this);
		thread.start();
	}
	public void run() {
		System.out.println(thread);
		System.out.println(thread.toString());
		
	}	
	public static void main(String[] args) {
		new Test8();
	}
}

// Thread[#21,Thread-0,5,main]

