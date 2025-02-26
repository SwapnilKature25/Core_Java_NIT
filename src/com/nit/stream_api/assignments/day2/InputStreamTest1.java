package com.nit.stream_api.assignments.day2;

import java.util.stream.Stream;

public class InputStreamTest1 {
	public static void main(String[] args) { 
		Stream<Integer> filter = Stream.of(1,2,3,4,5,6,7,8,9,10).filter(n -> n%2==0);
		filter.map(n -> n*n).forEach(System.out::println);
		 
		 
	}
}