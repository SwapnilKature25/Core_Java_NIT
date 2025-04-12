package com.nit.Encapsulation.NSB;

class Sample
{
	{
		System.out.println("Instance OR Non static block");
	}
}

public class InstanceBlockDemo1 
{
	public static void main(String[] args) 
	{
		new Sample(); //Nameless OR Anonymous Object
		new Sample();
	}

}
