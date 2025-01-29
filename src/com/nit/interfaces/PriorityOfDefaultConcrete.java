package com.nit.interfaces;

interface A
{
	default void m1()
	{
		System.out.println("Default Method of interface A");
	}
}
class B 
{
	public void m1()
	{
		System.out.println("Concrete Method of Class B");
	}
}

class C extends B implements A 
{
}

public class PriorityOfDefaultConcrete {

	public static void main(String[] args) 
	{
		C c1 = new C();
		c1.m1();

	}

}