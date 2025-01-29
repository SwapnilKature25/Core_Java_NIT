package com.nit.multithreading.assignments.mcq2;

class NIT11 implements Runnable 
{
	@Override
	public void run() {
		for(int a=0;a<10;a++)
		{
			System.out.println("NareshIT1");
			try {
				 Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("NIT Thread failed");
			}
		}
	}
}

class NIT22 implements Runnable
{
	@Override
	public void run() {
		for(int a =0;a<10;a++) 
		{
			System.out.println("NareshIT2");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("NIT1 Thread failed");
			}
		}
		
	}
}

public class Problem3 {
	public static void main(String[] args) {
		Runnable nit = new NIT11();
		Runnable nit1 = new NIT22();
		
		Thread thread = new Thread(nit);
		Thread thread1 = new Thread(nit1);
		
		thread.start();
		thread1.start();
    }
}
