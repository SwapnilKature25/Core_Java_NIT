package com.nit.practice.stream_api;

//Flattening of prime, even and odd number

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo3
{
	public static void main(String[] args)
	{
    List<Integer> primeNumbers = Arrays.asList(5,7,11);
    List<Integer> evenNumbers = Arrays.asList(2,4,6);
    List<Integer> oddNumbers = Arrays.asList(1,3,5);
    
    List<List<Integer>> nestedColl = List.of(primeNumbers,evenNumbers,oddNumbers);
    System.out.println(nestedColl); 
    
   List<Integer> flatList = nestedColl.stream().flatMap(num -> num.stream()).sorted().collect(Collectors.toList());
   
   System.out.println(flatList);
    
   
   
   List<String> listOfNames = Arrays.asList("Jaya","Aryan","Virat","Aakash");
   
	List<Character> list = listOfNames.stream().flatMap(str -> Stream.of(str.charAt(0))).toList(); //toList() java16V
	System.out.println(list);
	
	}

}