package com.nit.Encapsulation.NSB;

class Demo
{
	{
		System.out.println("NSB1");
	}
	
	public Demo()
	{		
		super();
		System.out.println("Demo class Constructor");
	}
	
	{
		System.out.println("NSB2");
	}
		
}

public class InstanceBlockDemo2 
{

	public static void main(String[] args) 
	{
		new Demo();

	}

}

/* NSB1
NSB2
Demo class Constructor */