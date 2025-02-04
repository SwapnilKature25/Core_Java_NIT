package com.nit.jvm_architecture;

//Program that describes we can load a .class file by using new keyword (Object creation) OR by accessing static data member of the class.


class Demo5
{
	static int x = 10;
	static
	{
		System.out.println("Static Block of Demo class Executed!!! :"+x);
	}
}
public class ClassLoadingUsingNewKeyword 
{
	public static void main(String[] args) 
	{	
		System.out.println("Main Method");
		new Demo5();		// using new keyword
	    System.out.println(Demo5.x);	// using static data member of the class
	}
}