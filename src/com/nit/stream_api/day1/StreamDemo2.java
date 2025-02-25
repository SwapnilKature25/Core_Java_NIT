package com.nit.stream_api.day1;

// Arrays.stream(int arr[])
import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamDemo2 {
	public static void main(String[] args) 
	{
		int arr[]= {10,20,30,40,50,60};
		IntStream stream = Arrays.stream(arr);
		stream.forEach(System.out::println);
	
		System.out.println("=========================");
		
		long arr2[]= {10,20,30,40,50,80};
		LongStream stream2 = Arrays.stream(arr2);
		stream2.forEach(System.out::println);
		
		System.out.println("=========================");
		
		double arr3[] = {12.32, 13.22, 25.33, 54.43};
		DoubleStream stream3 = Arrays.stream(arr3);
		stream3.forEach(System.out::println);
		
		System.out.println("=========================");
		
		String str[]= {"Pune", "Mumbai", "Hyd", "Chennai"};
		Stream<String> stream4 = Arrays.stream(str);
		stream4.forEach(System.out::println);

		
	}
}
