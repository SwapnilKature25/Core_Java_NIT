package com.nit.exception;

public class TryBlockInternals {

	public static void main(String[] args) {
		try
		{
//			System.out.println(10/0);
//			or
			throw new ArithmeticException("I am dividing no by zero");   // from this we can say that try blocck internally creates exception object with the help of JVM and thorws to nearest block
		}
		catch(Exception e)
		{
			System.out.println("Inside catch block ");
			e.printStackTrace();
		}
	}

}
