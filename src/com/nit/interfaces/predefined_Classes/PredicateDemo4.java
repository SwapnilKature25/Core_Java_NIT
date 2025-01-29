package com.nit.interfaces.predefined_Classes;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateDemo4 {

	public static void main(String[] args) 
	{
		//Verify my name is Ravi or not
		
		Predicate<String> p4 = 	str -> str.equalsIgnoreCase("Ravi");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Name :");
		String name = sc.next();
		
		System.out.println("Are you Ravi :"+p4.test(name));
		
		sc.close();		

	}

}
