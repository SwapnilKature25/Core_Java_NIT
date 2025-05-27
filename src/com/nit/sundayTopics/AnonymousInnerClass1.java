package com.nit.sundayTopics;


@FunctionalInterface
interface Vehicle
{
	void move();  //SAM(Single Abstract Method)
}

class AnonymousInnerClass1 
{
	public static void main(String[] args) 
	{
		//Anonymous inner class
		Vehicle car = new Vehicle()
		{
			@Override
			public void move()
			{
				System.out.println("Moving with Car...");
			}	

		};
		car.move();

       Vehicle bike = new Vehicle()
		{
			@Override
			public void move()
			{
				System.out.println("Moving with Bike...");
			}
		};
		bike.move();
	}
}