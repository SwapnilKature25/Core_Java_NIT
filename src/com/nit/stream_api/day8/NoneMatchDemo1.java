package com.nit.stream_api.day8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class NoneMatchDemo1 {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1,3,5,7,9);

		Predicate<Integer> isEven = n -> n%2==0;
		
		boolean noneEven = num.stream().noneMatch(isEven);
	
		if(noneEven)
		{
			System.out.println("There are no even number");
		}
		else {
			System.out.println("There is at least one even number");			
		}
	}

}
