package com.nit.interfaces;


sealed interface Moveable permits Cars
{
	int SPEED = 100; //public + static + final
	void move();  //public + abstract	
}

non-sealed class Cars implements Moveable
{
	@Override
	public void move() 
	{
		//SPEED = 120;   [Invalid]
		System.out.println("Car is Moving with :"+SPEED+ "KM/Hr");
		
	}	
}

public class InterfaceDemo1
{
	public static void main(String[] args) 
	{
	   Moveable m = new Cars();
	   System.out.println("SPEED of Car is :"+Moveable.SPEED);
	   m.move();
	}

}