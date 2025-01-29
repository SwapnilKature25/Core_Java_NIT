package com.nit.multithreading.assignments.bakery;

public class BakeryExample {
	public static void main(String[] args) {
		
		Bakery bakery = new Bakery();
        Thread bakerThread = new Thread(new Baker(bakery));
        bakerThread.start();

        Thread[] customers = new Thread[5];
        for (int i = 0; i < customers.length; i++) {
            customers[i] = new Thread(new Customer(bakery, "Customer " + (i + 1)));
            customers[i].start();
        }

        try {
            bakerThread.join();
            for (Thread customer : customers) {
                customer.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Bakery simulation finished.");
		
	}
}
