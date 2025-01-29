package com.nit.multithreading;

//case 2 : Implementing run() method by using By using Lambda :

public class RunnableLambaDemo {
	public static void main(String[] args) {
		Runnable r1=() -> 
		{
			String name=Thread.currentThread().getName();
			System.out.println("Current Thread name is : "+name);  //Current Thread name is : Thread-0
		}; 
		Thread t1=new Thread(r1);
		t1.start();
	}
}

