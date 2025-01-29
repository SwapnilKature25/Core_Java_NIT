package com.nit.multithreading;


//Anonymous inner class by using Runnable interface :

// case 1 : Implementing run() method by using Anonymous inner class :

public class AnonymousRunnable
{
	public static void main(String[] args) {
		Runnable r1=new Runnable()
		{
			@Override
			public void run()
			{
				String name=Thread.currentThread().getName();
				System.out.println(name);	// Thread-0
			}
		};
		Thread t=new Thread(r1);
		t.start();
	
	}
}