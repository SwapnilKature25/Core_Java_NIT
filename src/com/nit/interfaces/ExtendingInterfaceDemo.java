package com.nit.interfaces;

/* Extending interface :
---------------------
One interface can extends another interface, it cannot implement because interface cannot provide implementation for the abstract method. */

interface Alphaa
{
	void m1();
}
interface Betaa extends Alphaa
{
	void m2();
}
class MyClass implements Betaa
{

	@Override
	public void m1() 
	{
		System.out.println("M1 method Overridden");		
	}

	@Override
	public void m2() 
	{
		System.out.println("M2 method Overridden");		
	}
}

public class ExtendingInterfaceDemo {

	public static void main(String[] args) 
	{
		MyClass m = new MyClass();
		m.m1(); m.m2();

	}

}
