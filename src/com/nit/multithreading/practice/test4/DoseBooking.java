package com.nit.multithreading.practice.test4;

public class DoseBooking {
	private boolean booked=false;
	
	public synchronized void bookDose()
	{
		if(booked)
		{
			throw new RuntimeException("Dose already booked");
		}
		booked =true;
		System.out.println("Dose Booked Successfully");
	}
	
	public boolean isDoseBooked()
	{
		return booked;
	}
	
}
