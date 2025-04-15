package com.nit.practice.stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDemo3 
{
	public static void main(String[] args) 
	{
	  List<Integer> listOfNumber = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);
	  
	  //Without Stream API
	  List<Integer> even = new ArrayList<Integer>();
	  
	  for(Integer num : listOfNumber)
	  {
		  if(num % 2==0)
		  {
			  even.add(num);
		  }
	  }
	  
	  even.forEach(System.out::println);
	  
	  
	  
	  System.out.println("........................");
	  
	
	  //With Stream API
	  listOfNumber.stream().filter(num -> num%2==0).forEach(System.out::println);
	    
	  
	  
	  
	  
	}
}