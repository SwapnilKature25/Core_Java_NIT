package com.nit.stream_api.day7;

import java.util.Arrays;
import java.util.List;

// Counts the names which are containing the character 'A'

public class CountDemo4 {
	public static void main(String[] args) {
//		List<String> list = Arrays.asList("Ravi","Jane","Raj","Alen","Mike","Taj","Jane");  // 5
		List<String> list = Arrays.asList("Ravi","Rohit","Raj","Virat","Aradhya","Raj","Scott");
		
		long count = list.stream()
		.map(String::toUpperCase)
		.filter(str -> str.contains("A"))
		.distinct()
		.count();
		
		System.out.println(count);
	
	}
}
