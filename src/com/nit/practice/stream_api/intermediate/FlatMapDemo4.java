package com.nit.practice.stream_api.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Fetching first character using flatMap()

public class FlatMapDemo4 {

	public static void main(String[] args) {
	    List<String> listOfNames = Arrays.asList("Jaya","Aryan","Virat","Aakash");
	    
//		The flatMap() method is used to flatten multiple streams into one stream.
//	    However, since each stream here only has one element, the result is the same as using .map().
	    List<Character> collect = listOfNames.stream().flatMap(str -> Stream.of(str.charAt(0))).collect(Collectors.toList());
	    System.out.println(collect);  // [J, A, V, A]

	    
	}

}
