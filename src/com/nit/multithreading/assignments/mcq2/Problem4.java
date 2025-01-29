package com.nit.multithreading.assignments.mcq2;

public class Problem4 extends Thread {
	
//	public void run()
//	{
//		if(Thread.currentThread().isDaemon()) 
//		{
//			System.out.println("Daemon thread Running");
//		}
//		else
//			System.out.println("Normal Thread Running");
//		
//	}
	public static void main(String[] args) {
		if(Thread.currentThread().isDaemon()) 
		{
			System.out.println("Daemon thread Running");
		}
		else
			System.out.println("Normal Thread Running");
		

		Problem4 java = new Problem4();
		Problem4 java1 = new Problem4(); //setDaemon
		Problem4 java2 = new Problem4();
		Problem4 java3 = new Problem4();
		
		java1.setDaemon(true);
		
		java.start();
		java1.start();
		java2.start();
		java3.start();
		
    }
}


// Normal Thread Running
