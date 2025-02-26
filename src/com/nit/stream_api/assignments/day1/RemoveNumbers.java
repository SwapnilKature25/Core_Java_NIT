package com.nit.stream_api.assignments.day1;

import java.util.Arrays;

public class RemoveNumbers {
	public static void main(String[] args) {
		Integer[] numbers = {-10, -5, 0, 5, 10, 15, -20};
		
		Arrays.stream(numbers).filter(num -> num > 0).forEach(System.out::println);  // 5 10 15
		
		
	}
}

