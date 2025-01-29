package com.nit.multithreading.assignments.Day2;


class Problem6 
{
	public static void main(String[] args) 
	{
		Runnable r = new Runnable() 
		{
			public void run() {
				System.out.print("Cat");
 			}
 		};
 		Thread t = new Thread(r) {
 			public void run() {
 				System.out.print("Dog");
 			}
 		};
 		t.start();		// dog will be printed because thread class is a subclass of Runnable so it will give priority to itself
		
	}
}
