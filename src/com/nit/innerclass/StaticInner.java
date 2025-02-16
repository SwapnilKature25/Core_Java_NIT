package com.nit.innerclass;


//Static block of Outer and Inner class

class Outer4
{
	static int x = 100;
	static
	{
		System.out.println("Outer class static block");  //2
	}

	static class Inner
	{
		static
	    {
		System.out.println("Inner class static block");  //1
	    }

      public static void m1()
		{
			System.out.println("Static Method of inner class "+x); //3
		}

	}
}
public class StaticInner 
{	
	public static void main(String[] args) 
	{	 
	   Outer4.Inner.m1();
//	   Outer4.Inner i=new Outer4.Inner();
//	   i.m1();
	}
}
