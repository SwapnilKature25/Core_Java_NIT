package com.nit.multithreading.assignments;


class Test extends Thread
{
	public void run()
	{
		for(int i=0; i<=10; i++)
		{
			System.out.println("Hello Welcome here.."+i);
		}
	}
}
class MCQ_Day_1 
{
	public static void main(String[] args) 
	{
		Test t = new Test();
//		t.start();
		System.out.println(t);		// Thread[#21,Thread-0,5,main]
//		t.start();	//java.lang.IllegalThreadStateException
	
		
		 	Thread t2 = Thread.currentThread();
			System.out.println(t2);
	        System.out.println("Name of thread  : "+t2.getName());
			System.out.println("Id of thread  : "+t2.getId());

		/*
		 Thread[#1,main,5,main]
		Name of thread  : main
		Id of thread  : 1
		 */
			
			
			 new Thread()
				{
			    public void run()
				{
			      System.out.println("task one");
			    }
			    }.start();

			  new Thread()
			  {
			    public void run()
				{
			      System.out.println("task two");
			    }
			  }.start();

//			  task one
//			  task two
			  
			  
			  
			  
			  
			
			  Runnable r1=new Runnable()
			  {
			    public void run()
				{
			      System.out.println("task one Runnable");
			    }
			  };

			  Runnable r2=new Runnable()
			  {
			    public void run()
				{
			      System.out.println("task two Runnable");
			    }
			  };
			    
			  Thread t11=new Thread(r1);
			  Thread t22=new Thread(r2);

			  t11.start();
			  t22.start();
			  
//			  task one Runnable
//			  task two Runnable
			  
			  
			  
	
	}
}
