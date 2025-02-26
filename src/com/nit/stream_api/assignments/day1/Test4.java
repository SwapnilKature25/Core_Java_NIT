package com.nit.stream_api.assignments.day1;
//  WAP to print all the names from String array where the length of the 
//name must be greater than 3.

import java.util.Arrays;

public class Test4 {
	public static void main(String[] args) {
		 String[] words = {"Raj", "Rohit", "Smirti", "Richa", "Sky"};
		 Object[] array = Arrays.stream(words).filter(str -> str.length() > 3).toArray();
		 System.out.println(Arrays.toString(array));
	}
}
