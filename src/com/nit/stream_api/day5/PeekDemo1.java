package com.nit.stream_api.day5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PeekDemo1 {
	public static void main(String[] args) {
		List<String> listOfCity = Arrays.asList("hyd","Pune","Chennai","Indore");
		Stream<Integer> lengthOfCity = listOfCity.stream().peek(city -> System.out.println("Fetching from Original :"+city.toUpperCase())).map(str -> str.length());
		lengthOfCity.forEach(System.out::println);
	}
}
