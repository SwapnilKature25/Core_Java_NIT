package com.nit.multithreading.assignments.mcq2;

public class Problem1 
{
	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Naresh I Technologies");
			}
		}).start();
		System.out.println(new Thread().isAlive());
    }
}
