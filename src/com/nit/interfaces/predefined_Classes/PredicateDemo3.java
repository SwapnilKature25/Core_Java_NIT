package com.nit.interfaces.predefined_Classes;


import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateDemo3
{
	public static void main(String[] args)
	{
		//Based on age person is eligible for voting or not
	
		Predicate<Integer> p3 = age -> age >=18;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Age :");
		int age = sc.nextInt();
	
		boolean isEligible = p3.test(age);
		
		if(isEligible)
		{
			System.out.println("You are eligible for Voting");
		}
		else
		{
			System.out.println("You are not eligible for Voting");
		}
		sc.close();
	}

}