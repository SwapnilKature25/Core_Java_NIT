package com.nit.stream_api.day7;

import java.util.List;

// Count Unique elements by using Stream API

public class CountDemo3 {

	public static void main(String[] args) 
	{
		List<String> listOfNames = List.of("Ravi","Jane","Raj","Alen","Mike","Raj","Jane");

		long count = listOfNames
				.stream()
				.distinct()
				.count();
		System.out.println(count);  //5
		
	}

}
