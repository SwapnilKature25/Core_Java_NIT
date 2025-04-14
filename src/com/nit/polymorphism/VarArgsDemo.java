package com.nit.polymorphism;

//Var args must be only one and last argument.

class Demo 
{
	// All commented codes are invalid
	
	/*
	 * public void accept(float ...x, int ...y) { }
	 * 
	 * public void accept(int ...x, int y) { }
	 * 
	 * public void accept(int...x, int ...y) {}
	 */
	  
	 
	public void accept(int x, int... y)   // Valid
	{
		System.out.println("x value is :" + x);
		
		for (int z : y) 
		{
			System.out.println(z);
		}
	}
}


public class VarArgsDemo
{
 public static void main(String[] args) 
 {
	  Demo d = new Demo();
	  d.accept(12,10,20,30,40);
 }
}