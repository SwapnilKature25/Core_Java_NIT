package com.nit.stream_api.assignments.day2;

import java.util.Arrays;
import java.util.List;

public class NamesWithSpecifiedLength {
	public static void main(String[] args) {
		List<String> names=
				Arrays.asList("Toby", "Anna", "Leroy", "Alex");
	
		names.stream().filter(str -> str.length()==4).sorted().limit(2).forEach(System.out::println);
	}
}
