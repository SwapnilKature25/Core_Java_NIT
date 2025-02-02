package com.nit.interfaces.basics;

interface ConcreteMethods
{
	public abstract void m1();
	public static void m2()
	{
		System.out.println("Static concrete method of interface");
	}
	
	public default void m3()
	{
		System.out.println("Default concrete method");
	}
//	private methods can be static or non-static private concrete methods
	private void m4()
	{
		System.out.println("Private concrete method");
	}
	
}

class IClass implements ConcreteMethods
{

	@Override
	public void m1() {
		System.out.println("m1() implemented in IClass");
	}
	
}
public class InterfaceConcreteMethods {
	public static void main(String[] args) {
		IClass i1=new IClass();
		i1.m1();
//		i1.m2();	 we can't access static methods from implemented class object
		ConcreteMethods.m2();
		i1.m3();
//		i1.m4();
//		ConcreteMethod
		
	}
}
