package com.nit.practice.stream_api.intermediate;

import java.util.List;
import java.util.stream.Stream;

public class SortedDemo1 {

	public static void main(String[] args) {
		 //Print the numbers in ascending order
		 List<Integer> listOfNum = List.of(89,67,56,45,23,15); 
		 listOfNum.stream().sorted().forEach(System.out::println);
		 
		 System.out.println("+++++++++++++++++");
		 
		 
		 //Print the numbers in descending order
		 listOfNum.stream().sorted((i1,i2) -> i2.compareTo(i1))
		 .forEach(System.out::println);
		 
		 System.out.println("+++++++++++++++++");

		 //Print the names in Ascending order
		 Stream<String> strOfName = Stream.of("Ankit","Scott","Smith","James");
		 strOfName.sorted().forEach(System.out::println);
		 System.out.println("+++++++++++++++++");
		 
		 //Print the names in Descending order
		 strOfName.sorted((s1,s2)-> s2.compareTo(s1)).forEach(System.out::println);
		 System.out.println("+++++++++++++++++");
	
	}

}
