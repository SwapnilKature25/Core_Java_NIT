package com.nit.multithreading;

class Customer2 implements Runnable
{
	
	private int availableSeat=2;
	private int wantedSeat;
	
	public Customer2(int wantedSeat)
	{
		this.wantedSeat=wantedSeat;
	}
	
	@Override
	public void run()
	{
		String name=null;
		
		if(this.availableSeat >= wantedSeat)
		{
			name= Thread.currentThread().getName();
			System.out.println(wantedSeat + " berth is reserved for "+name);
			availableSeat-=wantedSeat;
		}
		else {
			System.out.println("Available seat  : " + this.availableSeat);
			name=Thread.currentThread().getName();
			System.out.println("Sorry!! "+ name+ " berth is not available now");
		}
	}
	
}

public class DrawbackOfMultithreading
{
	public static void main(String[] args) {
		Customer2 c=new Customer2(2);
		Thread t1=new Thread(c,"Smith");
		Thread t2=new Thread(c,"Mike");
		t1.start();
		t2.start();
		
	}
}
