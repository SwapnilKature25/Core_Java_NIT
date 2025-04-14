package com.nit.Encapsulation.NSB;

class Test
{
	int x;
	
	public Test()
	{
		x = 590;
		{
			x = 190;
			System.out.println("x value is :"+x);
		}	
		System.out.println("x value is :"+x);
	}	
	
	{
		x = 190;
		System.out.println("x value is :"+x);
	}	
}

public class InstanceBlockDemo5 
{
	public static void main(String[] args) 
	{
		Test t1 = new Test();
	}

}

//x value is :190
//x value is :190
//x value is :190

