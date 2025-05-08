package com.nit.Encapsulation.NSB;

class Foo
{
	Foo()
	{
		System.out.println("No Argument Constructor");
	}
	
	Foo(int x)
	{
		this();
		System.out.println("Parameterized Constructor");
	}
	
	{
		System.out.println("NSB");
	}
	
}


public class InstanceBlockDemo3 {

	public static void main(String[] args)
	{
	    new Foo();
	    new Foo(10);

	}

}

/* NSB
NSB inside no arg
No Argument Constructor
NSB
Parameterized Constructor
 */