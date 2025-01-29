package com.nit.multithreading.assignments.mcq2;

public class Problem5 extends Thread {
	
	public void display() {
		for(int a=0;a<5;a++) 
		{
			System.out.println("display");
		}
	}
	
	public void display1() {
		for(int a=0;a<5;a++) 
		{
			System.out.println("display1");
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Problem5 java = new Problem5();
		java.start();
		java.display();
		java.display1();
		java.wait();		// java.lang.IllegalMonitorStateException: current thread is not owner
    }
}

