package com.nit.stream_api.day7;

import java.util.Vector;

class EvenOrOdd
{
	public static void isEven(int number)
	{
		if(number%2==0)
		{
			System.out.println(number+" is even");
		}
		else 
		{
			System.out.println(number+" is odd");			
		}
	}
}

public class StaticMethodReferenceDemo {
	public static void main(String[] args) {
		Vector<Integer> numbers = new Vector<>();
		numbers.add(5);
		numbers.add(2);
		numbers.add(4);
		numbers.add(12);
		
		// By Using lambda 
		numbers.forEach(num -> EvenOrOdd.isEven(num));
		
		
		System.out.println("==============");
		
		
		// By Using Method Reference
		numbers.forEach(EvenOrOdd::isEven);
		
		
		
	}
}
