package com.nit.stream_api.day1;

import java.util.Arrays;
import java.util.stream.Stream;

// WAP to print all the names whose length is greater than 3 from string array

public class FilterDemo6
{
	public static void main(String[] args)
	{
		String[] names = {"Scott", "Raj","Riya","Smith","ALen"};
		Arrays.stream(names).filter(str -> str.length() > 3).forEach(System.out::println);
	}
}
