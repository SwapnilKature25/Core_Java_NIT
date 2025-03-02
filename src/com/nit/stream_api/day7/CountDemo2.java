package com.nit.stream_api.day7;

import java.util.List;

// count the name whose length is greater than 3

public class CountDemo2 {
	public static void main(String[] args) 
	{
		List<String> listOfNames = List.of("Ravi","Raj","Alen","Mike","Jane");
		
		long count = listOfNames.stream().filter(str -> str.length() > 3).count();
		System.out.println(count);  //4
	}
}
