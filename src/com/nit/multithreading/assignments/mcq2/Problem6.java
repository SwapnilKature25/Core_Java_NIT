package com.nit.multithreading.assignments.mcq2;


public class Problem6 extends Thread {
	
	public void display() {
		for(int a=0;a<5;a++) 
		{
			System.out.println("display");
		}
	}
	
	public void display1() {
		for(int a=0;a<5;a++) 
		{
			System.out.println("display1");
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Problem6 java = new Problem6();
		java.start();
		java.display();
		java.sleep(1000);
		java.display1();
    }
}

/* display
display
display
display
display
display1
display1
display1
display1
display1
 */
