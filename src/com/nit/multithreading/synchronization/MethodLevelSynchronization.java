package com.nit.multithreading.synchronization;

class Table
{
   public synchronized void printTable(int num) 
   {
	   String name = Thread.currentThread().getName();
	   System.out.println(name+" thread is started!!");
     for(int i=1; i<=10; i++)
     {
    	try
    	{
    		Thread.sleep(1000);
    	}
    	catch(InterruptedException e)
    	{
    		e.printStackTrace();
    	}
       System.out.println(num+" X "+i+" = "+(num*i));   
     }
     System.out.println(name+" thread is completed!!");
   }
}

public class MethodLevelSynchronization 
{
	public static void main(String[] args) 
	{
		Table obj = new Table(); //lock is created
		Runnable r1 = () -> obj.printTable(4);
		Thread t1=new Thread(r1);
		
		Thread t2 = new Thread()
		{
			@Override
			public void run()
			{
				obj.printTable(10);
			}
		};

		t1.start();  t2.start();
		
	}

}