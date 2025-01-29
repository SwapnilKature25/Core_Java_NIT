package com.nit.multithreading.practice.test4;

public class User {
	private String name;
	private VaccineEligibility eligibility;
	private DoseBooking booking;
	
	public User(String name, int age, boolean hasHealthCondition )
	{
		this.name=name;
		this.eligibility=new VaccineEligibility(age,hasHealthCondition);
		this.booking=new DoseBooking();
	}
	public boolean isEligible()
	{
		return eligibility.isEligible();
	}
	public void bookDose()
	{
		if(!isEligible())
		{
			 throw new RuntimeException(name +" is not eligible for the vaccine");
		}
		booking.bookDose();
		System.out.println("Dose booked successfully for "+name);
	}
	public boolean isDoseBooked()
	{
		return booking.isDoseBooked();
	}
}
