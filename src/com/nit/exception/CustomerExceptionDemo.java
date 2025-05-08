package com.nit.exception;

import java.util.Scanner;

public class CustomerExceptionDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome client, Welcome to my application");
		Scanner sc = new Scanner(System.in);
		
	    try
	    {
	    	System.out.print("Enter the value of a :");
			int a = sc.nextInt();
			
			System.out.print("Enter the value of b :");
			int b = sc.nextInt();			
			
			int result = a/b;
			System.out.println("Result is :"+result);
	    }
	    catch(Exception e)
	    {
	    	System.err.println("Sir, Please don't put zero here");
	    }

	    System.out.println("Thank you client, Have a nice Day!!!");
	    sc.close();
	}

}