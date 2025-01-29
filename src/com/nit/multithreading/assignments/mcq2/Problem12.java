package com.nit.multithreading.assignments.mcq2;

class NIT24 extends Thread
{
	@Override
	public void run() {
		System.out.println(currentThread().getId());
	}
}

public class Problem12 {
	
	public static void main(String[] args) throws InterruptedException {
		for(int a = 0; a<10;a++) 
		{
			Thread newThread = new Thread(new NIT24());
		  newThread.start();
		}
    }
}

/* 22
24
26
28
30
32
34
36
40
38
*/