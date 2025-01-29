package com.nit.multithreading.assignments.Day3;

public class Test7 extends Thread
{
	public void run() {
		System.out.print(Thread.currentThread().getId()+" ");
//		System.out.print(Thread.currentThread().getName()+" ");
	}
	
	@Override
	public void start() {
		System.out.print(Thread.currentThread().getName()+" ");
	}
	
	public static void main(String[] args) {
		Test7 nit = new Test7();
		for(int i=0;i<10;i++)
		{
			nit.run();
		}
	}
}

// 1 1 1 1 1 1 1 1 1 1 