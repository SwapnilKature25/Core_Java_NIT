package com.nit.exception;

import java.util.Scanner;

public class NullPointerExpDemo extends Throwable {
	public static void main(String[] args) {
		String s=null;
//		System.out.println(s.length());
	// Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null

		
//		NumberFormatException 
		String convert="nit";
//		int num=Integer.parseInt(convert);
//		Exception in thread "main" java.lang.NumberFormatException: For input string: "nit"

		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(n);
	}
}	

