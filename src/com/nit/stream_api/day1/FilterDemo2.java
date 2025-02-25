package com.nit.stream_api.day1;

import java.util.List;

// Fetch all the name which starts with 'A'

public class FilterDemo2
{
	public static void main(String[] args) 
	{
		List<String> listOfNames = List.of("Akriti","Smriti","Richa","Ankita");
		listOfNames.stream().filter(n -> n.startsWith("A")).forEach(System.out::println);;
	}
}
