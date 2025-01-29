package com.nit.multithreading.assignments.Day3;


public class Test9 implements Runnable
{
	Thread thread;
	public Test9() {
		thread = new Thread(this,"NareshIT");
		thread.setPriority(6);
		thread.start();
	}
	public void run() {
		System.out.println(thread);
		
	}
	public static void main(String[] args) {
		new Test9();
	}
}

// Thread[#21,NareshIT,6,main]