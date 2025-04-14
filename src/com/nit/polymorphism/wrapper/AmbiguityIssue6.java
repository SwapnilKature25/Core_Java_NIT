package com.nit.polymorphism.wrapper;

class Test6
{	
	public void accept(long s)
	{
		System.out.println("Widening");
	}	
	public void accept(Integer i)
	{
		System.out.println("Autoboxing");
	}	
}
public class AmbiguityIssue6 {

	public static void main(String[] args) 
	{
		Test6 t = new Test6();
		t.accept(12);        
    }
}