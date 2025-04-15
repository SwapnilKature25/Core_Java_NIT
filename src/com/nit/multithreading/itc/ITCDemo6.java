package com.nit.multithreading.itc;

//Program on notifyAll() method :

class Resource 
{
  private boolean flag = false;

  public synchronized void waitMethod() //child1  child2  child3
	{
		System.out.println("Wait");  
		
     	while (!flag)
		{
        try 
		  {
           System.out.println(Thread.currentThread().getName() + " is waiting...");
           System.out.println(Thread.currentThread().getName()+" is Waiting for Notification");
           wait(); 
        } 
		  catch (InterruptedException e) 
		  {
              e.printStackTrace();
        }
      }
      System.out.println(Thread.currentThread().getName() + " thread completed!!");
  }

  
  public synchronized void setMethod() 
	{
		System.out.println("notifyAll");
		this.flag = true;
      System.out.println(Thread.currentThread().getName() + " has make flag value as a true");
      notifyAll(); // Notify all waiting threads that the signal is set
  }
}

public class ITCDemo6
{
  public static void main(String[] args) 
		{   	
  	
  	
      Resource r1 = new Resource(); //lock is created

      Thread t1 = new Thread(() -> r1.waitMethod(), "Child1");
		Thread t2 = new Thread(() -> r1.waitMethod(), "Child2");
		Thread t3 = new Thread(() -> r1.waitMethod(), "Child3");

		t1.start();
      t2.start();
      t3.start();
     
		
		Thread setter = new Thread(() -> r1.setMethod(), "Setter_Thread");
    
		   try 
			{
	            Thread.sleep(2000);
	        } 
			catch (InterruptedException e) 
			{
	            e.printStackTrace();
	        }
		
	       setter.start();
  }
}

/* Wait
Child1 is waiting...
Child1 is Waiting for Notification
Wait
Child3 is waiting...
Child3 is Waiting for Notification
Wait
Child2 is waiting...
Child2 is Waiting for Notification
notifyAll
Setter_Thread has make flag value as a true
Child1 thread completed!!
Child2 thread completed!!
Child3 thread completed!!
 */