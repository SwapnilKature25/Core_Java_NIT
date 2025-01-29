package com.nit.multithreading.assignments.mcq3;
//
//public class NewPlatForm7 implements Runnable {
//
//	public static void main(String[] args) {
//		Thread t = new Thread(this);
//		t.start();
//
//	}
//
//	public void run() {
//		System.out.println("test");
//	}
//
//}


//class  A implements Runnable
//{
//public void run()
//{
//	  System.out.println("run-a");
//}
//
//}
//public class NewPlatForm7 
// {
//public static void main(String[] args)
//{
//	  A a= new A();
//	  Thread t= new Thread(a);
//	      t.start();
//	      t.start();
//	
//}
//}


class MyThread extends Thread {
	   public static Thread mt;

	   public void run() {
	      try {
	         mt.join();
	      } catch(InterruptedException ie) {}
	      System.out.print("Child ");
	   }
	}

	public class NewPlatForm7 {
	   public static void main(String[] args) 
	                 throws InterruptedException {
	      MyThread.mt = Thread.currentThread();
	      MyThread t = new MyThread();
	      t.start();
	      Thread.sleep(1000);
	      System.out.print("Main ");
	   }
	}		// A: Main Child