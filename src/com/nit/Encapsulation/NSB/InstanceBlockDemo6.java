package com.nit.Encapsulation.NSB;

class Hello
{
	public Hello()
	{
		System.out.println("Constructor");
	 	{
			System.out.println("NSB2");
		}		
	}
	{
		System.out.println("NSB1");
	}	
}


public class InstanceBlockDemo6
{
	public static void main(String[] args) 
	{
		new Hello();

	}

}

//NSB1
//Constructor
//NSB2
