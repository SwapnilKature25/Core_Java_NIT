package com.nit.interfaces.day1;

interface AdvancedArithmetic
{
	public abstract int divisorSum(int num);
}

public class MyCalculator implements AdvancedArithmetic 
{

	@Override
	public int divisorSum(int num) {
		int sum=0;
		if(num<=0)
		{
			System.out.println("Input must be a positive integer");
		}
		else {
			for(int i=1; i<=num; i++)
			{
				if(num%i==0)
				{
					sum+=i;
				}
			}
		}
		
		return sum;
	}
	
}
