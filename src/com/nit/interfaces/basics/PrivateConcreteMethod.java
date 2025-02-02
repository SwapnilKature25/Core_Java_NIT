package com.nit.interfaces.basics;

interface ITest
{
	private static void m1()
	{
		System.out.println("static Private method");
	}
	private void m2()
	{
		System.out.println("Non-static Private method");
	}
	public default void access()
	{
		ITest.m1();		// static private method call
		this.m2();		// non-static private method call
	}
}
public class PrivateConcreteMethod implements ITest{
	public static void main(String[] args) {
		PrivateConcreteMethod p=new PrivateConcreteMethod();
		p.access();
		
	}
}
