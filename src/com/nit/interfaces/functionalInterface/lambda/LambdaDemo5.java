package com.nit.interfaces.functionalInterface.lambda;

import java.util.Scanner;

@FunctionalInterface
interface Calculator
{
	Double getSquareAndCube(Integer num);
}


public class LambdaDemo5 {

	public static void main(String[] args) 
	{
		Calculator calc = num -> 
		{
			if(num<=0)
			{
				return -1D;
			}
			else if(num % 2== 0)
			{				
				Double y = Double.valueOf(num*num);
				return y;
			}
			else
			{
				Double z = Double.valueOf(num*num*num);
				return z;
			}			
		};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int no = sc.nextInt();
		
		System.out.println(calc.getSquareAndCube(no));
		
		sc.close();
	}

}
