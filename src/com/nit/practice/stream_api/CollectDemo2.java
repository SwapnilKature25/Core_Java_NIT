package com.nit.practice.stream_api;


//Group the city name according to length of the city name
import java.util.*;
import java.util.stream.Collectors;

public class CollectDemo2
{
  public static void main(String[] args) 
  {
      List<String> items = Arrays.asList("Delhi", "Indore", "Kolkata", "Pune", "Hyderabad","Mumbai","Chennai");

      Map<Integer, List<String>> collect = items.stream().collect(Collectors.groupingBy(String::length));
    
      collect.forEach((len, cities)-> System.out.println(len+ " :"+cities));
      
   
  }
}

/* 4 :[Pune]
5 :[Delhi]
6 :[Indore, Mumbai]
7 :[Kolkata, Chennai]
9 :[Hyderabad]
 */