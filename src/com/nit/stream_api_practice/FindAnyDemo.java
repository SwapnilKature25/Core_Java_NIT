package com.nit.stream_api_practice;

import java.util.List;
import java.util.Optional;

public class FindAnyDemo {

	public static void main(String[] args) 
	{
        List<String> listOfName = List.of("Sachin", "Ankit", "Aman", "Rahul", "Ravi");
        
        Optional<String> anyElement = listOfName.stream().filter(str -> str.startsWith("t"))
        			.findAny();
        
        anyElement.ifPresentOrElse(
        	    System.out::println,
        	    () -> System.out.println("No element found")
        	);
        
//        anyElement.ifPresent(System.out::println);
        
        // findFirst() 
         listOfName.stream().findFirst().ifPresent(System.out::println);
        
    }

}
