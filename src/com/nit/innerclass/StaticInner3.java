package com.nit.innerclass;


//Static block of Outer and Inner class

class Outer7
{
//	static int x = 100;
	static
	{
		System.out.println("Outer class static block"); 
	}

	static class Inner
	{
		static
	    {
		System.out.println("Inner class static block");  //1
	    }

    public static void m1()
		{
			System.out.println("Static Method of inner class "); //2
//			System.out.println("Static Method of inner class "+x); 
		}

	}
}
public class StaticInner3
{	
	public static void main(String[] args) 
	{	 
	   Outer7.Inner.m1();

	}
}
// Here outrt static block not loaded because to load we have to create object or we ahve to access static memeber of the class then the class will be loaded
//Inner class static block
//Static Method of inner class 
