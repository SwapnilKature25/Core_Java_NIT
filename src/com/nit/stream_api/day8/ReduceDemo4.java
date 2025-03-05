package com.nit.stream_api.day8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo4 {
	public static void main(String[] args) {
		List<String> str = Arrays.asList("Java","is","best");
		Optional<String> addString = str.stream().reduce((a,b) -> a+" "+b);
		addString.ifPresent(System.out::println);  // Java is best
	
	}
}
