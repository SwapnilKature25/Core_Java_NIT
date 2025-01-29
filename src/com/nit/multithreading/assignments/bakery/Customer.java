package com.nit.multithreading.assignments.bakery;

public class Customer implements Runnable 
{
	Bakery bakery;
	String customerName;
	
	public Customer(Bakery bakery, String customerName) {
		super();
		this.bakery = bakery;
		this.customerName = customerName;
	}

	
	 @Override
	    public void run() {
	        while (!bakery.isProductionFinished()) {
	            bakery.buyGoods(customerName);
	        }
	        System.out.println(customerName + " has finished buying.");
	    }

}
