package com.nit.abstraction;


//--------------------------------------------------------------
//Program on Anonymous inner class using abstract class :
//-------------------------------------------------------

abstract class Vehicle
{
	public abstract void run();
}

public class AnonymousInnerDemo2 
{
	public static void main(String[] args) 
	{
		//Anonymous inner class
		Vehicle car = new Vehicle()
		{
			@Override
			public void run() 
			{
				System.out.println("Car is Running");				
			}
			
		};
		
		//Anonymous inner class
		Vehicle bike = new Vehicle()
		{
			@Override
			public void run() 
			{
				System.out.println("Bike is Running");				
			}			
		};		
		car.run();  bike.run();
	}

}