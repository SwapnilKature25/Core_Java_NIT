package com.nit.interfaces.functionalInterface.lambda;

import java.util.Scanner;

@FunctionalInterface
interface Calculate
{
	double doSum(double x, double y);
	
}

public class LambdaDemo2 {

	public static void main(String[] args) 
	{
		Calculate c1 =  (a, b)->  a + b;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a :");
		double p = sc.nextDouble();
		System.out.println("Enter the value of b :");
		double q = sc.nextDouble();

		System.out.println("Sum is :"+c1.doSum(p, q));
		sc.close();
	}

}
