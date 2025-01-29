package com.nit.multithreading.assignments.mcq3;

class ThreadGroupTest extends Thread {
	public void run() {
		System.out.println("Thread is running");
	}

	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("First Group");
		ThreadGroupTest obj = new ThreadGroupTest();
		Thread t1 = new Thread(tg, obj, "First Thread");
		Thread t2 = new Thread(tg, obj, "Second Thread");
		Thread t3 = new Thread(tg, obj, "Third Thread");
		tg.setMaxPriority(7);
		System.out.println(tg.getName());
	}
}