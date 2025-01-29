package com.nit.multithreading.practice.test3;

public class PetrolPumpSimulation {
	public static void main(String[] args) throws InterruptedException {
		PetrolPump pump=new PetrolPump();
		Car[] cars= {new Car(pump,"BMW"), new Car(pump,"Audi")};
		
		Thread t1= new Thread(cars[0]);
		Thread t2=new Thread(cars[1]);
		
		Thread threads[]= {t1,t2};
		for(Thread t : threads)
		{
			t.start();
			t.join();
		}
		
	}
}
