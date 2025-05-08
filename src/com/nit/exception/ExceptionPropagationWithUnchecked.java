package com.nit.exception;

public class ExceptionPropagationWithUnchecked {

	public static void main(String[] args) 
	{
	   System.out.println("Main Method started..");	  //1
	  try
	  {
		  m1();
	  }
	  catch(ArithmeticException e)
	  {
		  System.out.println("Handled in main"); //3
	  }
	   System.out.println("Main Method ended..");	 // 4
	}
	public static void m1() 
	{
	   System.out.println("M1 Method started..");  //2	
	   m2();
	   System.out.println("M1 Method ended..");	
	}
	public static void m2() 
	{		
		throw new ArithmeticException();		
	}
}