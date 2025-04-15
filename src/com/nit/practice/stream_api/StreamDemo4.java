package com.nit.practice.stream_api;

import java.util.Arrays;
import java.util.List;
//Filtering the name which starts with 'R' character with Stream API where duplicate are not allowed and in Alphabetical order
public class StreamDemo4 
{
	public static void main(String[] args) 
	{
		List<String> listOfName = Arrays.asList("Raj","Rahul","Ankit","Roshan","Raj","Scott","Rohit","Ratan","Ravi");
		
		listOfName.stream().filter(str -> str.startsWith("R")).distinct().sorted().forEach(System.out::println);
		
		
	}	
}
