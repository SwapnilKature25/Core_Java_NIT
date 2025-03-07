package com.nit.practice.stream_api.intermediate;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/* 1. These interfaces contain static method of(T ...values) through which we can create corresponding type of element.
   2. Arrays which is a predefined class in java.util package provides a predefined method
      called stream() which will also convert corresonding array object into Stream type 
 */

public class PrimitiveToStreamDemo1 {

	public static void main(String[] args) {
		IntStream intStream = IntStream.of(1,2,3,4,5,6,7,8);
		LongStream longStream = LongStream.of(1l,2l,3l,4l,5l);
		DoubleStream doubleStream = DoubleStream.of(1.1,1.2,1.3,1.4,1.5);
		
		intStream.forEach(System.out::println);
		System.out.println();
		
		longStream.forEach(System.out::println);
		System.out.println();
		
		doubleStream.forEach(System.out::println);
		System.out.println();
		
		int a[] = {1,2,3,4,5};
		IntStream intStream2 = Arrays.stream(a);
		
		long l[] = {1L, 2L, 3L, 4L};
		LongStream longStream2 = Arrays.stream(l);
		
		double d[] = {1.2, 2.6, 3.9, 8.9};
		DoubleStream doubleStream2 = Arrays.stream(d);
		
		intStream2.forEach(System.out::println);
		System.out.println();
		longStream2.forEach(System.out::println);
		System.out.println();
		doubleStream2.forEach(System.out::println);
		System.out.println();
	}

}
