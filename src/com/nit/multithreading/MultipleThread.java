package com.nit.multithreading;

class Test2 extends Thread
{
	public void run()
	{
		String name=Thread.currentThread().getName();
		System.out.println("Current thread is : "+name);
	}
}
public class MultipleThread {

	public static void main(String[] args) {
		Test2 t1=new Test2();
		Test2 t2=new Test2();
		t1.start();
		t2.start();
		
		

	}

}
