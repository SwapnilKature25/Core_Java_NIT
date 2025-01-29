package com.nit.multithreading.practice.test4;

public class VaccineEligibility {
	private int age;
	private boolean hasHealthCondition;
	
	public VaccineEligibility(int age,boolean hasHealthCondition)
	{
		this.age=age;
		this.hasHealthCondition=hasHealthCondition;
	}
	
	public boolean isEligible()
	{
		return (age>=18 && age<60) && hasHealthCondition;
	}
}
