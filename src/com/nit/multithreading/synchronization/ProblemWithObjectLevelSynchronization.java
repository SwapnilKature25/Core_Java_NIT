package com.nit.multithreading.synchronization;

class PrintTable
{
	    public synchronized void printTable(int n)
	    {
	    	String name = Thread.currentThread().getName();
	    	System.out.println("Current thread : "+name+" started executing");
	       for(int i=1; i<=10; i++)
	       {
	    	   System.out.println(n+" X "+i+" = "+(n*i));
	    	   try
	    	   {
	    		   Thread.sleep(500);
	    	   }
	    	   catch(Exception e)
	    	   {	    		   
	    	   }
	       }
	       System.out.println("Current thread : "+name+" completed executing");
	       System.out.println(".......................");
	    }	
}

public class ProblemWithObjectLevelSynchronization
{
	public static void main(String[] args) 
	{
		
		PrintTable pt1 = new PrintTable(); //lock1 [2 , 3]		
		PrintTable pt2 = new PrintTable(); //lock2 [8 , 9]	
				
				Thread t1 = new Thread()  //Anonymous inner class concept
				{
			       @Override
			       public void run()
			       {
			    	   pt1.printTable(2);	//lock1
			       }			   
				};
		       	        
		        Thread t2 = new Thread()
				{
			       @Override
			       public void run()
			       {
			    	   pt1.printTable(3);	//lock1
			       }			   
				};
		                
		        Thread t3 = new Thread()
				{
			       @Override
			       public void run()
			       {
			    	   pt2.printTable(8);	//lock2
			       }			   
				};
		               
		        Thread t4 = new Thread()
				{
			       @Override
			       public void run()
			       {
			    	   pt2.printTable(9); //lock2
			       }			   
				};
				 t1.start();	t2.start();	 t3.start();  t4.start(); 
	}
}

