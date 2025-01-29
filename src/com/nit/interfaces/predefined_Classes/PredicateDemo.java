package com.nit.interfaces.predefined_Classes;

import java.util.Scanner;
import java.util.function.Predicate;

/* @FunctionalInterface
public interface Predicate<T>   
{
  boolean test(T x);
}
*/

public class PredicateDemo
{
	public static void main(String[] args) 
	{
		//WAP to verify whether a number is even or odd
		
		Predicate<Integer> p1 = num -> num%2==0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number :");
		int num = sc.nextInt();

		System.out.println("Is "+num+" even number ?"+p1.test(num));
		sc.close();
	}

}