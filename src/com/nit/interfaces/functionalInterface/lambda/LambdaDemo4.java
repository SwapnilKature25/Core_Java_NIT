package com.nit.interfaces.functionalInterface.lambda;

import java.util.Scanner;

@FunctionalInterface
interface Verifier
{
	boolean verify(Integer num);
}

public class LambdaDemo4 
{
	public static void main(String[] args) 
	{
		//Check whether a number is even or odd
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number :");
		int no = sc.nextInt();
				
         Verifier v1 =  num -> 
         {
            return num % 2==0;	
         };
         
         System.out.println("Is "+no+ " even Number :"+v1.verify(no));
         sc.close();
	}
	//Enter a Number :4
//	Is 4 even Number :true
}