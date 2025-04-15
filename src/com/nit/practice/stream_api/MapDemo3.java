package com.nit.practice.stream_api;
 

//Retrieve first character of all the given name


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo3 {

	public static void main(String[] args) 
	{
	  List<String> listOfName = Arrays.asList("Jaya","Arnav","Virat","Aryan");
	  
	  List<Character> collect = listOfName.stream().map(str -> str.charAt(0)).collect(Collectors.toList());
	  System.out.println(collect);

	}

}