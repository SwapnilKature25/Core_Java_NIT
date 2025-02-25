package com.nit.stream_api.day1;

import java.util.Arrays;
import java.util.List;

// WAP to fetch the first Character form the given list of String

public class MapDemo3 {

	public static void main(String[] args) {
		
		List<String> asList=Arrays.asList("Java","Aryan","Virat","Arun");
		asList.stream().map(str -> str.charAt(0)).forEach(System.out::print);
	}

}
