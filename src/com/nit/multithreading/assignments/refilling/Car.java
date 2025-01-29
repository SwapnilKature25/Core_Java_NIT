package com.nit.multithreading.assignments.refilling;

public class Car implements Runnable 
{
	private String name;
	PetrolPump pump;
	
	public Car(String name, PetrolPump pump) {
		super();
		this.name = name;
		this.pump = pump;
	}

	@Override
	public void run() {
		System.out.println(name+ " arrived on pump");
		pump.refillCar(name);
	}

}
