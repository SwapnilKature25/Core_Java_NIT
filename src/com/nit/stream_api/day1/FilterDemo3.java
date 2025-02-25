package com.nit.stream_api.day1;

import java.util.Arrays;
import java.util.stream.IntStream;

// 1] Retrieve all the even number from Array using stream API and convert the stream into array

public class FilterDemo3 
{
	public static void main(String[] args) 
	{
		int arr[] = {10,15,20,35,40,55,90,75};
		System.out.println("Original Array : "+Arrays.toString(arr));
		
		IntStream stream = Arrays.stream(arr);
		int[] array = stream.filter(ele -> ele%2==0).toArray();
		System.out.println("Even Array ELements : "+Arrays.toString(array));
	}
}
