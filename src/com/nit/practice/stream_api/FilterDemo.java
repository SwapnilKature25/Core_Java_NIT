package com.nit.practice.stream_api;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterDemo {

	public static void main(String[] args) 
	{
		List<String> listOfName = List.of("Aryan","Ankit","Raj","Rohit","Aniket","Raj","Aryan","Ajinkya","Ankit");
		
		//Retrieve all the names which starts from character A and it should not 
		//contain duplicate
		System.out.println("========================");
		
		Set<String> filteredName = listOfName.stream().filter(str -> str.startsWith("A")).collect(Collectors.toSet());
		System.out.println(filteredName);
		
		Set<String> collect = listOfName.stream().filter(str -> str.startsWith(str, 'A')).collect(Collectors.toSet());
		System.out.println(collect);
	
	}

}