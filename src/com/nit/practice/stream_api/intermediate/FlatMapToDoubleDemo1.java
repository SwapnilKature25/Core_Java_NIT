package com.nit.practice.stream_api.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;

public class FlatMapToDoubleDemo1 {

	public static void main(String[] args) {
		double d1[] = new double[]{1.1, 1.2, 1.3};
    	double d2[] = new double[]{2.1, 2.2, 2.3};
    	double d3[] = new double[]{3.1, 3.2, 3.3};
        
    	List<double[]> doubleArray = Arrays.asList(d1,d2,d3);
    	DoubleStream flatMapToDouble = doubleArray.stream().flatMapToDouble(array -> Arrays.stream(array));
    	flatMapToDouble.forEach(System.out::println);
    	
	}

}
