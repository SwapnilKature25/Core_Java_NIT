package com.nit.multithreading.assignments.Day3;

public class Test5 extends Thread
{
	public void run() {
		System.out.print(Thread.currentThread().getId()+" ");
	}
	public static void main(String[] args) {
		for(int i=0;i<10;i++)
		{
			Test5 nit = new Test5();//1000x 2000x --- ref var will store different address
			nit.start();
		}
		
	}
}

// 21 22 23 25 27 28 26 24 29 30 