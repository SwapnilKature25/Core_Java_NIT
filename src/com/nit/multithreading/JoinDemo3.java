package com.nit.multithreading;

//Note : Here main thread is waiting for main thread to 
//       complete so, It is deadlock situation.

public class JoinDemo3 
{
	public static void main(String[] args) throws InterruptedException 
	{
       System.out.println("Main Thread started");
       
       Thread t = Thread.currentThread();
       
       for(int i=1; i<=10; i++)
       {
    	   System.out.println(i+" by "+t.getName());
       }
       
       t.join();  //Deadlock [Main thread is waiting 4 main thread to complete]
           
       System.out.println("Main Thread Ended");
	}
}

/* Main Thread started
1 by main
2 by main
3 by main
4 by main
5 by main
6 by main
7 by main
8 by main
9 by main
10 by main */