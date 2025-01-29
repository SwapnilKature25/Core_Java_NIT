package com.nit.multithreading.assignments.mcq2;


class NIT33 extends Thread
{
	public void display() throws InterruptedException {
		for(int a=0;a<5;a++) 
		{
			System.out.println("NIT Display");

			Thread.sleep(500);
		}
	}
}

class NIT44 extends Thread
{
	public void display1() throws InterruptedException {
		for(int a=0;a<5;a++) 
		{
			System.out.println("NIT Display1");
			
			Thread.sleep(1000);
		}
	}
}

public class Problem7 {
	
	public static void main(String[] args) throws InterruptedException {
		NIT33 nit = new NIT33();
		NIT44 nit1 = new NIT44();
		
		nit.start();
		nit1.start();
		
		nit.display();
		nit1.display1();
    }
}

