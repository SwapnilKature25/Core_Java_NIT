package com.nit.stream_api.day4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

public class FlatMapDemo6 {
	public static void main(String[] args) {
		int []arr1= {10,20,30};
		int []arr2= {40,50,60};
		int []arr3= {70,80,90};
		
		List<int[]> asList = Arrays.asList(arr1,arr2,arr3);
		
		int[] array2 = asList.stream().flatMapToInt(array -> Arrays.stream(array)).toArray();
		System.out.println(Arrays.toString(array2));
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		
		double d1[]= {1.1,1.2,1.3};
		double d2[]= {2.1,2.2,2.3};
		double d3[]= {3.1,3.2,3.3};
		
		List<double[]> asList2 = Arrays.asList(d1,d2,d3);
		
		double[] array = asList2.stream().flatMapToDouble(arr -> DoubleStream.of(arr)).toArray();
		System.out.println(Arrays.toString(array));
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

		LongStream lstr=LongStream.of(1l,2l,3l,4l,5l);
		lstr.forEach(System.out::println);
		
	}
}
