package com.nit.multithreading.assignments.Day3;

public class Test6 extends Thread
{
	public void run() {
		System.out.print(Thread.currentThread().getId()+" ");
	}
	
	@Override
	public void start() {
		System.out.print(Thread.currentThread().getName()+" ");
	}
	
	public static void main(String[] args) {
		Test6 nit = new Test6();
		for(int i=0;i<10;i++)
		{
			nit.start();
		}
	}
}

// main main main main main main main main main main 