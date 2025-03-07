package com.nit.practice.stream_api.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo4 {

	public static void main(String[] args) {
		//Find the length of the name
		List<String> listOfName = Arrays.asList("Rahul","Scott","Raj","Elina","Aaarti","Puja");
		List<Integer> len = listOfName.stream().map(str -> str.length()).collect(Collectors.toList());
		len.forEach(System.out::println);
		System.out.println(len);
	
	
		System.out.println();
		
		//Retrieve first character of all the given name
		List<Character> firstChar = listOfName.stream().map(str -> str.charAt(0)).collect(Collectors.toList());
		firstChar.forEach(System.out::println); // here not good approach
		System.out.println(firstChar);
	
	
		//Retrieve the name whose length is > 3 and convert those names in uppercase
		
		List<String> collect = listOfName.stream().filter(l -> l.length() > 3).map(str -> str.toUpperCase()).collect(Collectors.toList());
		System.out.println(collect);
	}
}
