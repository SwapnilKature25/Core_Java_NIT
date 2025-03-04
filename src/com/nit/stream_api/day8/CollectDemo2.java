package com.nit.stream_api.day8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Group the city name according to length of the city name

public class CollectDemo2 {

	public static void main(String[] args) {
		List<String> items = Arrays.asList("Delhi","Pune","Hyd","Mumbai","Chennai");
		Map<Integer, List<String>> groupByLen = 
				items.stream()
				.collect(Collectors.groupingBy(String::length));
		
		groupByLen.forEach((len, cities) -> System.out.println(len+" "+cities) );
	}

}
