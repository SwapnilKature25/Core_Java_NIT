package com.nit.multithreading.assignments.refilling;

public class PetrolPumpSimulation {
	public static void main(String[] args) {
		PetrolPump pump=new PetrolPump();
		Car[] cars = {new Car("BMW", pump),new Car("Gwagon", pump)};
		
		Thread t1 = new Thread(cars[0]);	
		Thread t2 = new Thread(cars[1]);
		
		Thread threads[] = {t1,t2};
		
		for (Thread thread : threads) {
			thread.start();
			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
