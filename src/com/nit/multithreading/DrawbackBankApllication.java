package com.nit.multithreading;


class Customer3
{
	private double availableBalance = 20000;
	private double withdrawAmount;
	
	public Customer3(double withdrawAmount) 
	{
		super();
		this.withdrawAmount = withdrawAmount;
	}
	
	public void withdraw()
	{
		String name = null;
		
		if(withdrawAmount <= availableBalance)
		{			
			name = Thread.currentThread().getName();
			System.out.println(name+" has successfully withdraw :"+withdrawAmount+" amount");
			availableBalance = availableBalance - withdrawAmount;
			
		}
		else
		{
			name = Thread.currentThread().getName();
			System.err.println("Sorry!!!"+name+" you have insufficient balance ");
		}
	}	
	
}

public class DrawbackBankApllication {

	public static void main(String[] args) throws InterruptedException 
	{
		Customer3 c1 = new Customer3(20000);
		
		Runnable r1 = () -> c1.withdraw();
		
		
		Thread t1 = new Thread(r1,"Scott");
		Thread t2 = new Thread(r1,"Smith");
		
		t1.start();  
		t2.start();		

	}

}
