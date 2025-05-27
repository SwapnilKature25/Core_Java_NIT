package com.nit.sundayTopics;

//Static block of Outer and Inner class

class Out
{
	static int x = 100;
	static
	{
		System.out.println("Outer class static block");
	}

	static class Inner
	{
		static
	    {
		System.out.println("Inner class static block");
	    }

      public static void m1()
		{
			System.out.println("Static Method of inner class "+x);
		}

	}
}
public class StaticInnerClass3 
{	
	public static void main(String[] args) 
	{	 
	   Out.Inner.m1();
	}
}