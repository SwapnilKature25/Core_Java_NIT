package com.nit.polymorphism.wrapper;


class Test5
{
	public void accept(int d, long l)
	{
		System.out.println("int-long");
	}
	public void accept(long s, int i)
	{
		System.out.println("long-int");
	}	
}
public class AmbiguityIssue4
{

	public static void main(String[] args) 
	{
		Test5 t = new Test5();
//		t.accept(9,9);    // CTE
	}
}