package com.nit.multithreading;

class Customer1
{
	private double availableBalance = 20000;
	private double withdrawAmount;
	
	public Customer1(double wtdAmt)
	{
		super();
		this.withdrawAmount=wtdAmt;	
	}
	
	public void withdraw()
	{
		String name=null;
		if(withdrawAmount <= availableBalance)
		{
			name=Thread.currentThread().getName();
			System.out.println(name + " has successfully withdrawn : "+withdrawAmount+" amount");
			availableBalance -=withdrawAmount;
		}
		else {
			name=Thread.currentThread().getName();
			System.out.println("Sorry !! "+name+" you have Insufficient Balance");
		}
	}
}
public class BankApplication {

	public static void main(String[] args) {
		Customer1 c1=new Customer1(20000);
		Runnable r1= ()-> c1.withdraw();
		Thread t1=new Thread(r1, "Scott");
		Thread t2=new Thread(r1, "Smith");
		t1.start();
		t2.start();
	}

}

/* Smith has successfully withdrawn : 20000.0 amount
Scott has successfully withdrawn : 20000.0 amount
 */
