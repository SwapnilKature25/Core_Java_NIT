package com.nit.sundayTopics;
//How to create object for inner class and instance block execution flow

class FooOuter
{
	 int x = 15;
	 
	{
		System.out.println("Outer class non static block");
	}
	
	 class Inner  
	{
		 
		{
			System.out.println("Inner class non static block");
		}
		
		public  void m1()
		{
			System.out.println("m1 static method :"+x);
		}		
	}
}
public class NestedDemo 
{
public static void main(String[] args) 
{
	 FooOuter fo = new FooOuter(); //Outer class object
	 
	 FooOuter.Inner in = fo.new Inner(); //inner class object
	  in.m1();
 }
}