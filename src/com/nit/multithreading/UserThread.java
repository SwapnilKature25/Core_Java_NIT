package com.nit.multithreading;

class Test  extends Thread
{
	@Override
	public void run()
	{
		System.out.println("User thread is running");
	}	
}
public class UserThread {

	public static void main(String[] args) {
		System.out.println("Main thread is created");
//		System.out.println(10/0);
		Test t=new Test();
		t.start();
		System.out.println("Main thread is Ended");

	}

}
