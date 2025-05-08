package com.nit.exception;

import java.util.Scanner;

@SuppressWarnings("serial")
class InvalidAgeException extends Exception
{
	public InvalidAgeException()
	{		
	}
	
	public InvalidAgeException(String errorMessage)
	{
		super(errorMessage);
	}
}

public class CustomCheckedException 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try(sc)
		{
			System.out.print("Enter your Age :");
			int age = sc.nextInt();
			validateAge(age);
		}
		catch (InvalidAgeException e) 
		{
			System.err.println("You are not allowed for Movie "+e);
		}
		
	}
	
	public static void validateAge(int age) throws InvalidAgeException
	{		
		if(age<18)
		{
			throw new InvalidAgeException("Age is Invalid");
			
		}
		else
		{
			System.out.println("You are allowed for Movie");
		}
		
		
	}

}