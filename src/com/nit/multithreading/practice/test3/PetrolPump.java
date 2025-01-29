package com.nit.multithreading.practice.test3;

public class PetrolPump {
	public synchronized void refillCar(String carName)
	{
		System.out.println(carName +" started refilling");
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println(carName +" completed refilling");
	}
}
