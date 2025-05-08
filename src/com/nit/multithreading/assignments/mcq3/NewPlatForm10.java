package com.nit.multithreading.assignments.mcq3;

//class NewPlatForm10 extends Thread {
//	public void run() {
//		for (int i = 0; i <= 3; i++)
//			System.out.println(Thread.currentThread().getPriority());
//	}
//
//	public static void main(String[] args) {
//		NewPlatForm10 obj = new NewPlatForm10();
//		Thread t1 = new Thread(obj);
//		Thread t2 = new Thread(obj);
//		t1.setPriority(2);
//		t2.setPriority(Thread.NORM_PRIORITY);
//		t1.start();
//		t2.start();
//	}
//}

//public class NewPlatForm10 implements Runnable {
//	public void run() {
//		System.out.println("running...");
//	}
//
//	public static void main(String[] args) {
//		Thread thread = new Thread(new MyThread());
//		System.out.println(thread.isDaemon());	// false
//		thread.setDaemon(true);	
//		thread.start();
//		System.out.println(thread.isDaemon());	// true
//	}
//
//}

class NewPlatForm10 extends Thread {
	public void run() {
		System.out.println("thread running....");
	}

	public static void main(String args[]) {
		Object obj = new Object();
//		obj.start();
		NewPlatForm10 obj1 = new NewPlatForm10();
		obj1.start();
	}
}