package com.nit.exception;

public class ExceptionFormat {
	public static void main(String[] args) {
		ArithmeticException e=new ArithmeticException("Divided the no by zero");
		System.out.println(e.toString());  // java.lang.ArithmeticException: Divided the no by zero

		
	}
}
