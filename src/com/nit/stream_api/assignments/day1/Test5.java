package com.nit.stream_api.assignments.day1;
//  WAP to print all the unique numbers from the Array.

import java.util.Arrays;
import java.util.stream.Collectors;

public class Test5 {
	public static void main(String[] args) {
		 Integer[] numbers = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 4};
		 Object[] array = Arrays.stream(numbers).collect(Collectors.toSet()).toArray();
		 System.out.println("Unique Numbers : "+Arrays.toString(array));
	}
}
