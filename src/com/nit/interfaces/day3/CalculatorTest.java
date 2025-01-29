package com.nit.interfaces.day3;

interface Calculator
{
	void calculateSum(int... n);
}

class SimpleCalculator implements Calculator
{

	@Override
	public void calculateSum(int... n) {
		int sum=0;
		for(int s : n)
		{			
			sum+=s;
		}
		System.out.println("Sum of Numbers  : "+sum);		
	}
	
}

public class CalculatorTest {
	public static void main(String[] args) {
		SimpleCalculator s=new SimpleCalculator();
		s.calculateSum(1,2,3,4);
	}
}
