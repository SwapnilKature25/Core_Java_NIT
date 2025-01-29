package com.nit.multithreading.assignments.mcq2;


	class NIT31 extends Thread
	{
		@Override
		public void run() {
			System.out.println(currentThread().getName());
			System.out.println(currentThread().getPriority());
		}
	}

	public class Problem11 {
		
		public static void main(String[] args) throws InterruptedException {
			NIT31 nit = new NIT31();
			nit.run();
	    }
	}

