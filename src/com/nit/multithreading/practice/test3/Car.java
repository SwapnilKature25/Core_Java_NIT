package com.nit.multithreading.practice.test3;

public class Car implements Runnable{
	String name;
	PetrolPump pump;
	
	public Car(PetrolPump pump,String name)
	{
		this.name=name;
		this.pump=pump;
	}
	
	@Override 
	public void run()
	{
		pump.refillCar(name);
	}
	
	
	
}
