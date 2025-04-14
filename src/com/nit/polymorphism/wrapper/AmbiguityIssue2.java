 package com.nit.polymorphism.wrapper;

  class Test2
{
	public void accept(short ...d)
	{
		System.out.println("short");
	}
	public void accept(byte ...d)
	{
		System.out.println("byte");
	}	
}
public class AmbiguityIssue2 {

	public static void main(String[] args) 
	{
		Test2 t = new Test2();
		t.accept();
	}
}
