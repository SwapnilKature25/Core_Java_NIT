package com.nit.jvm_architecture;

class Foo3
{	
	static int x;

    static
	{		
		System.out.println("x value is :"+x);
	}	
}

public class StaticBlockDemo2 
{
	public static void main(String[] args) 
	{
		 new Foo3();
	}
}