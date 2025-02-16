package com.nit.innerclass;

//Note : An inner class can directly access the private data of Outer class.

class Outer 
{
	private int a = 15;

	class Inner 
	{
		public void displayValue() 
		{
			System.out.println("Value of a is " + a);
		}
	}
}
public class OuterPrivateData
{
	public static void main(String... args)  
	{		
		Outer out = new Outer();

		Outer.Inner in = out.new Inner();

		in.displayValue();
		
	}
}