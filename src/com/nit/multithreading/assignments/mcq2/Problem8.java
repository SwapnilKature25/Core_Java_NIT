package com.nit.multithreading.assignments.mcq2;

class NIT55 extends Thread
{
	@Override
	public void run() {
		for(int a=0;a<5;a++) 
		{
			System.out.println("NIT Display");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class NIT66 extends Thread
{
	@Override
	public void run() {
		for(int a=0;a<5;a++) 
		{
			System.out.println("NIT Display1");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Problem8 {
	
	public static void main(String[] args) throws InterruptedException {
		NIT55 nit = new NIT55();
		NIT66 nit1 = new NIT66();
		
		nit.start();
		nit1.start();
    }
}
