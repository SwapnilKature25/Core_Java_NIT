package com.nit.stream_api.day4;

import java.util.List;
import java.util.stream.Stream;

public class SortedDistinctDemo1 {
	public static void main(String[] args) {
		
		//Print the no. in ascending order
		List<Integer> listOfNum = List.of(65,77,32,11,89,45);
		listOfNum.stream().sorted().forEach(System.out::println);
		
		System.out.println("========================================");
	
		//Print the no. in descending order
		
		List<Integer> listOfNumber = List.of(65,77,32,11,89,45);
		listOfNumber.stream().sorted((i1,i2) -> i2.compareTo(i1)).forEach(System.out::println);;
	
	
		System.out.println("========================================");
	
		//Print the no. in ascending order
		Stream<String> strOfName = Stream.of("Ankit","Scott","Smith","James");
		strOfName.sorted().forEach(System.out::println);
	
	
		System.out.println("========================================");
	
		//Print the no. in descending order
		Stream<String> names = Stream.of("Ankit","Scott","Smith","James");
		names.sorted((s1,s2) -> s2.compareTo(s1)).forEach(System.out::println);;
				
		
		System.out.println("========================================");
		Stream<String> dis = Stream.of("Ankit","Scott","Smith","James","Scott","James");
		dis.sorted().distinct().forEach(System.out::println);
		
		
		
	}
}
