package com.nit.stream_api.day8;

import java.util.Arrays;
import java.util.List;

public class AnyMatchDemo1 {

	public static void main(String[] args) {
		List<String> players = List.of("Virat", "Rohit", "Bumrah", "Surya");
		
		boolean startsWithA = players.stream().anyMatch(name -> name.startsWith("A"));
		System.out.println("Any name starts with A : "+startsWithA);
		
		System.out.println("==============");
		
		List<Integer> num = Arrays.asList(1,3,4,7,9);
		boolean anyEven = num.stream().anyMatch(n -> n%2==0);
		
		if(anyEven)
		{
			System.out.println("There is at least one even number");
		}
		else {
			System.out.println("There are no even number");			
		}
	
	}

}
