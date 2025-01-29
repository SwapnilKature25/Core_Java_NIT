package com.nit.multithreading;

//case 4 : Implementing run() method by using Using Contructor But Without Reference :

public class RunnableImplementationUsingContructorWithoutRef {

	public static void main(String[] args) {
		new Thread(new Runnable()
		{
			@Override
			public void run() {
				String name=Thread.currentThread().getName();
				System.out.println("Current Thread name is "+name); //Thread-0
			}
		}).start();;
	}

}
