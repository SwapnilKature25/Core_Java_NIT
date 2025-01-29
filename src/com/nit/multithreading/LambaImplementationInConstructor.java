package com.nit.multithreading;

//case 4 : Lamba Implementation In Constructor : 

public class LambaImplementationInConstructor {
	public static void main(String[] args) {
		new Thread(()-> System.out.println(Thread.currentThread().getName())).start();  // Thread-0
		new Thread( ()-> System.out.println(Thread.currentThread().getName()),"Child1").start();  // Child1
	}
}
