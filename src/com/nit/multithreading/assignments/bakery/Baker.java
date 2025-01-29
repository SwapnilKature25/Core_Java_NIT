package com.nit.multithreading.assignments.bakery;

public class Baker implements Runnable
{
	Bakery bakery;
	
	public Baker(Bakery bakery) {
		super();
		this.bakery = bakery;
	}

	@Override
	public void run() {
		while(bakery.isProductionFinished())
		{
			bakery.bakeGoods();
		}
		System.out.println("Baker finished baking for the day.");
	}
	
}
