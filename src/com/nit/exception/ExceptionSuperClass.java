package com.nit.exception;

public class ExceptionSuperClass {

	public static void main(String[] args) {
		Exception e1=new ArithmeticException();
		System.out.println(e1);
		
		e1=new ArrayIndexOutOfBoundsException();
		System.out.println(e1);
		
		e1=new NullPointerException();
		System.out.println(e1);

		e1=new NumberFormatException();
		System.out.println(e1);
		
		
	}

}
