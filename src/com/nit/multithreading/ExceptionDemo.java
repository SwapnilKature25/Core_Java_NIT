package com.nit.multithreading;

class Stuff extends Thread
{
	@Override
	public void run()
	{
		String name=Thread.currentThread().getName();
		System.out.println("Child thread name is "+name);
//		System.out.println(10/0);
		System.out.println("Start() is responsible for creation of new thread like "+name);
	}
}
public class ExceptionDemo {
	public static void main(String[] args) {
		String name=Thread.currentThread().getName();
		
		System.out.println(name + " thread is started");
		Stuff s=new Stuff();
		s.start();
		System.out.println(name + " thread is Ended");
		
	}
}
