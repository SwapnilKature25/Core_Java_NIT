package com.nit.interfaces;

interface DefaultMethod {
	 void abstractMethod();
	 default void defaultMethod() {
		System.out.println("Default method in Interface");
	 }
}

class ImplementerClass implements DefaultMethod
{

	public void abstractMethod() {
		System.out.println("Abstract method is Overridden");
	}
	@Override
	public void defaultMethod()
	{
		System.out.println("Not bounded to Override");
	}
}
public class InterfaceDefaultMethod
{
	// we can't write default method in normal class
	public static void main(String[] args) {
		ImplementerClass t=new ImplementerClass();
		t.abstractMethod();
		t.defaultMethod();
	}
}