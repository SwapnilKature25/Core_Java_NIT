package com.nit.abstraction;

abstract class Bike
{
	protected int speed = 60;
	
	public Bike()
	{
		System.out.println("Bike Constructor");
	}
	
	public void getBikeDeatils()
	{
		System.out.println("It has two wheels");
	}
	
	public abstract void run();
	
}

class KTM extends Bike
{
	@Override
	public void run() 
	{
		System.out.println("KTM Bike is running");		
	}	
}

public class AbstractDemo2 {

	public static void main(String[] args) 
	{
		Bike obj = new KTM();
		System.out.println("SPEED IS :"+obj.speed);
		obj.getBikeDeatils();
		obj.run();
	}

}