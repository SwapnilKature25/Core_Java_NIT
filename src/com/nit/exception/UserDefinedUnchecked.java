package com.nit.exception;

import java.util.Scanner;

@SuppressWarnings("serial")
class GreaterMarksException extends RuntimeException
{
	public GreaterMarksException()
	{		
	}
	
	public GreaterMarksException(String errorMessage)
	{
	   super(errorMessage);	
	}
}


public class UserDefinedUnchecked {

	public static void main(String[] args) 
	{       
		Scanner sc = new Scanner(System.in);
		try(sc)
		{
			System.out.print("Enter your Marks :");
			int marks = sc.nextInt();
			validateMarks(marks);
		}
		catch(GreaterMarksException e)
		{
			System.out.println(e);
		}

	}

	public static void validateMarks(int marks)
	{
		if(marks > 100)
		{
			throw new GreaterMarksException("Invalid Marks");
		}
		else
		{
			System.out.println("Your Marks is :"+marks);
		}
	}
}