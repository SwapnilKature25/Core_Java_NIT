package com.nit.multithreading.assignments.refilling;

public class PetrolPump {
	public synchronized void refillCar(String carName)
	{
		System.out.println(carName + " started refilling..");
		try
		{
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println(carName + " completed refilling..");
	}
}