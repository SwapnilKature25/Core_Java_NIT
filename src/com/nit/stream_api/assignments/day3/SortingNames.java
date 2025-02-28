package com.nit.stream_api.assignments.day3;

import java.util.List;

public class SortingNames {
	public static void main(String[] args) {
		List<String> names= List.of("Alennn","Virat","Rohit","Igris","USA");
		List<String> list = names.stream().sorted((s1,s2)-> s1.length()-s2.length()).toList();
		System.out.println(list);
		list.stream().sorted().forEach(System.out::println);
		//		.forEach(System.out::println);
	}
}
