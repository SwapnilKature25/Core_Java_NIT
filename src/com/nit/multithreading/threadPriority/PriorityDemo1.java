package com.nit.multithreading.threadPriority;

class UserThread extends Thread
{
	
}
public class PriorityDemo1 {
	public static void main(String[] args) {
//		System.out.println(Thread.currentThread().getPriority());
		
		int priority=Thread.currentThread().getPriority();
		System.out.println("Main Thread Priority : "+priority);	// 5
		
		UserThread t=new UserThread();
		int userPriority=t.getPriority();
		System.out.println("User Thread Priority : "+userPriority);	//5
		
//		Note : Always child thread will acquire main thread priority.
//		The user-defined thread created as a part of main thread will acquire the same priority of main Thread.
	}
}
