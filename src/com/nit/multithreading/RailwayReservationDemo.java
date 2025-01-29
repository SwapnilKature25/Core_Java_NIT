package com.nit.multithreading;
// Most of the time, both the Threads will get the ticket.

class Customer implements Runnable
{
	private int availableSeat=1;
	private int wantedSeat;
	
	public Customer(int wantedSeat)
	{
		this.wantedSeat=wantedSeat;
	}
	@Override
	public void run() {
		String name = null;
		if(availableSeat >= wantedSeat)
		{
			name = Thread.currentThread().getName();
			System.out.println(wantedSeat + " berth is reserved for : "+name);
			availableSeat = availableSeat - wantedSeat;
		}
		else {
			System.out.println("Available seat is : "+ availableSeat);
			name = Thread.currentThread().getName();
			System.out.println("Sorry!! "+name+ " berth is not available");
		}
	}
	
}
public class RailwayReservationDemo {

	public static void main(String[] args) {
		Customer c1=new Customer(1);
		Thread t1=new Thread(c1,"Scott");
		Thread t2=new Thread(c1,"Smith");
		t1.start();
		t2.start();
		
	}

}
