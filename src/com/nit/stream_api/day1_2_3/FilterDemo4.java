package com.nit.stream_api.day1_2_3;
// WAP to Retrieve cities which starts with 'H' character.

import java.util.Arrays;
import java.util.stream.Stream;

public class FilterDemo4 
{
	public static void main(String[] args) {
		String cities[] = {"Hyd","Haryana","Pune","Indore"};
		Stream<String> stream = Arrays.stream(cities);
		Object[] array = stream.filter(str -> str.startsWith("H")).toArray();
		System.out.println(Arrays.toString(array));
	}
}
