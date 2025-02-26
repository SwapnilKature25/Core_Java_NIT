package com.nit.stream_api.day4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// Fetching first character using flatMap()

public class FlatMapDemo4 {
	public static void main(String[] args) {
		List<String> listOfNames=Arrays.asList("Jaya","Aryan","Virat","Akash");
		listOfNames.stream().flatMap(str ->Stream.of(str.charAt(0))).forEach(System.out::print);
		
	}
}