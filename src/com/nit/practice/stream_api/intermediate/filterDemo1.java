package com.nit.practice.stream_api.intermediate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class filterDemo1 {

	public static void main(String[] args) {
		//Filter all the even numbers from Collection 
		List<Integer> listOfNumber = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);

		// Without Stream API
		List<Integer> even = new ArrayList<>();
		
		for(Integer e : listOfNumber)
		{
			if(e%2==0)
			{
				even.add(e);
			}
		}
		even.forEach(System.out::println);
		
		System.out.println("======================");
		
		// With Stream API
		listOfNumber.stream().filter(x -> x%2==0).forEach(System.out::println);
		
		
	}

}
