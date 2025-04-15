package com.nit.multithreading.itc;

class TatkalTicket implements Runnable
{
	@Override
	public void run() 
	{
		String name = Thread.currentThread().getName();
		System.out.println("Tatkal ticket booked by :"+name);	
		
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}	
}

class PremiumTatkal implements Runnable
{
	@Override
	public void run() 
	{
		String name = Thread.currentThread().getName();
		System.out.println("Premium Tatkal ticket booked by :"+name);
		
	}	
}

public class ThreadGroupDemo3 
{
	public static void main(String[] args) throws InterruptedException 
	{
       ThreadGroup tatkal = new ThreadGroup("Tatkal");
       ThreadGroup premimumTatkal = new ThreadGroup("Premimum_Tatkal");
       
       
       Thread t1 = new Thread(tatkal, new TatkalTicket(), "t1");
       Thread t2 = new Thread(tatkal, new TatkalTicket(), "t2");
       Thread t3 = new Thread(tatkal, new TatkalTicket(), "t3");
       t1.start();  t2.start();  t3.start();
      
       System.out.println("Total active ticket of Tatkal : "+tatkal.activeCount());
       
       Thread t4 = new Thread(premimumTatkal,new PremiumTatkal(), "t4");
       Thread t5 = new Thread(premimumTatkal,new PremiumTatkal(), "t5");
       Thread t6 = new Thread(premimumTatkal,new PremiumTatkal(), "t6");
       t4.start(); t5.start(); t6.start();
       
       System.out.println("Total active ticket of PremiumTatkal : "+premimumTatkal.activeCount());
		
	}

}