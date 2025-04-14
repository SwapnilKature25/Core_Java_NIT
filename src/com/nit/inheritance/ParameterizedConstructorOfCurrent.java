package com.nit.inheritance;

class Base
{
	
	public Base()
	{
		this(15);
		System.out.println("No Argument Constructor of Base class");  //2
	}
	
	public Base(int x)
	{
		System.out.println("Parameterized Constructor of Base class :"+x);   //1
	}
}

class Derived extends Base
{
	public Derived()
	{
		System.out.println("No Argument Constructor of Derived class");  //3
	}
}

public class ParameterizedConstructorOfCurrent 
{
	public static void main(String[] args) 
	{
		Derived d = new Derived();
	}

}