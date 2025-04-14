package com.nit.Encapsulation.NSB;

class Samples
{
	final int x;  // blank final field
	
	{
		x = 123;
	}
	
	public Samples()
	{
//		 x = 234;  // The final field x may already have been assigned
	}
	{
//		x = 123;  // The final field x may already have been assigned
	}
	
}


public class BlankFinalFieldDemo {

	public static void main(String[] args) 
	{
		Samples s1 = new Samples();
		System.out.println(s1.x);  //123

	}

}
