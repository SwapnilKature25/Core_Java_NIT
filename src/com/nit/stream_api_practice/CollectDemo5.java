package com.nit.stream_api_practice;


//Partition the given number based on the Predicate

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectDemo5
{
  public static void main(String[] args) 
  {
      List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

      Map<Boolean, List<Integer>> partitioned = numbers.stream()
          .collect(Collectors.partitioningBy(n -> n % 2 == 1));

      System.out.println(partitioned); // {false=[2, 4, 6, 8, 10], true=[1, 3, 5, 7, 9]}

      
      List<Integer> numb = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 3);

      Map<Boolean, List<Integer>> part = numb.stream()
          .collect(Collectors.partitioningBy(
              n -> n % 2 == 1,
              Collectors.toList()));

      System.out.println(part);
      
      
//      Map<Boolean, Set<Integer>> partitioned = numbers.stream()
//              .collect(Collectors.partitioningBy(
//                  n -> n % 2 == 1,
//                  Collectors.toSet()));
//
//          System.out.println(partitioned);   // No duplicates
      
      
      
      Map<Boolean, Long> partition = numbers.stream()
              .collect(Collectors.partitioningBy
               (
                  n -> n % 2 == 1,
                  Collectors.counting()));   // it will count based on predicate and divide into two groups

          System.out.println(partition);
      
      
   }
}
