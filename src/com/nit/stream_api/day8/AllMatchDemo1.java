package com.nit.stream_api.day8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AllMatchDemo1 {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1,2,3,4,5);
		
		boolean allMatch = stream.allMatch(n -> n > 0);
		System.out.println("All elements are positive : "+allMatch );
		
		
		
		List<Integer> numbers = Arrays.asList(2,3,4,6,8,10);
		boolean allEven = numbers.stream().allMatch(n -> n%2==0);
		if(allEven)
		{
			System.out.println("All numbers are even");
		}
		else 
		{
			System.out.println("not all numbers are even");			
		}
	}

}
