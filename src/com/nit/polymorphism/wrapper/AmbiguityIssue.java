package com.nit.polymorphism.wrapper;

class Test
{
	/*
	public void accept(double d)
	{
		System.out.println("double");
	}
	public void accept(float d)
	{
		System.out.println("float");
	}	
	*/
	public void accept(short ...d)
	{
		System.out.println("short");
	}
	public void accept(char ...d)
	{
		System.out.println("char");
	}	
}
public class AmbiguityIssue {

	public static void main(String[] args) 
	{
		Test t = new Test();
//		t.accept(6);
//		t.accept();    //  no relation between char and short based on the specific type rule.

	}
}