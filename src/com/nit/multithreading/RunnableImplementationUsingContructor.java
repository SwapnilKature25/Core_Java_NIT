package com.nit.multithreading;

//case 3 : Implementing run() method by using Using Contructor :

public class RunnableImplementationUsingContructor {
	public static void main(String[] args) {
		Thread t=new Thread(new Runnable()
		{
			@Override
			public void run() {
				String name=Thread.currentThread().getName();
				System.out.println("Current Thread name is "+name); //Thread-0
			}
		});
		t.start();
	}
}
