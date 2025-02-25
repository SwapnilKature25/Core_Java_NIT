package com.nit.stream_api.day1;

// Fetch all the even numbers  from the collection

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterDemo1 {
	public static void main(String[] args) 
	{
		List<Integer> listOfNum=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
//		1) Without Stream API
		List<Integer> evenList = new ArrayList<>();
		for(Integer num : listOfNum)
		{
			if(num%2==0)
			{
				evenList.add(num);
			}
		}
		evenList.forEach(System.out::println);

		System.out.println("===============================");
		
//		1) With Stream API
		listOfNum.stream().filter(num -> num%2==0).forEach(System.out::println);
	
	
	}
}
