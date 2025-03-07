package com.nit.practice.stream_api.intermediate;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterDemo2 {

	public static void main(String[] args)
	{
		//Retrieve all the names which starts from character A and it should not contain duplicate
		List<String> listOfName = List.of("Aryan","Ankit","Raj","Rohit","Aniket","Raj","Aryan","Ajinkya","Ankit");
		
		Set<String> names = listOfName.stream()
		.distinct()
		.filter(str -> str.startsWith("A"))
		.collect(Collectors.toSet());
	
		names.forEach(System.out::println);
		
		System.out.println();
		
		 //Retrieve all the names which starts from R and duplicates are allowed
		List<String> list = Stream.of("Aryan","Ankit","Raj","Rohit","Ankit","Raj","Rohit","Ajinkya","Ankit")
		.filter(str -> str.startsWith("R"))
		.collect(Collectors.toList());
		
		list.forEach(System.out::println);
		
		System.out.println();
		
		
		//Filtering the name which starts with 'R' character with Stream API where duplicate are not allowed and in Alphabetical order
		Set<String> order = Stream.of("Aryan","Ankit","Raj","Rohit","Ankit","Raj","Rohit","Ajinkya","Ankit")
		.filter(str -> str.endsWith("t"))
		.sorted().distinct()
		.collect(Collectors.toSet());
		order.forEach(System.out::println);
		
	}

}
