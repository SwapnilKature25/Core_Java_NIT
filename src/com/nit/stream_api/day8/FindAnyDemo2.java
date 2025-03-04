package com.nit.stream_api.day8;

import java.util.List;

public class FindAnyDemo2 {

	public static void main(String[] args) {
		List<String> names = List.of("Sachin", "Ankit", "Aman","Rahul","Ravi");
		names.parallelStream()
		.filter(str -> str.startsWith("R"))
		.findAny()
		.ifPresent(System.out::println);
	}

}
