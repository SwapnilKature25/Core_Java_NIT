package com.nit.stream_api.assignments.day1;

import java.util.Arrays;

//WAP to print all the names from String array which contains 
//letter 'a' in the name.

public class Test2 {
	public static void main(String[] args) {
		 String[] names = {"Rahul", "Raj", "Arnav", "Scott", "Smith"};
		 Arrays.stream(names).filter(str -> str.contains("a") || str.contains("A")).forEach(System.out::println);
	}
}
