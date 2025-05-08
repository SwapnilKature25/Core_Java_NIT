package com.nit.exception;

public class ExceptionPropagationWithChecked {

	public static void main(String[] args) 
	{
	   System.out.println("Main Method started..");	 // 1
	   try
	   {
		   m1();
	   }
	   catch(ClassNotFoundException e)
	   {
		   System.out.println("Handled by main method");  // 4
	   }
	   System.out.println("Main Method ended..");	 // 5
	}
	public static void m1() throws ClassNotFoundException
	{
	   System.out.println("M1 Method started..");	 // 2
	   m2();
	   System.out.println("M1 Method ended..");	
	}
	public static void m2() throws ClassNotFoundException
	{		
		System.out.println("M2 method Body");	// 3	 
		
		Class.forName("Sample");
	}
}