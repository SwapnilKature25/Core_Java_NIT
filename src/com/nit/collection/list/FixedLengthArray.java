package com.nit.collection.list;

import java.util.Arrays;
import java.util.List;
/* Arrays class has provided a predefined static method called asList(T ...x), by 
 * using this asList() method we create a fixed length array.  */

public class FixedLengthArray {

	public static void main(String[] args) 
	{
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
		//numbers.add(8); java.lang.UnsupportedOperationException
		//numbers.add(0, 100); java.lang.UnsupportedOperationException
		//numbers.remove(0);  java.lang.UnsupportedOperationException
		numbers.set(0, 100);	// we can replaced but ca't modify
		System.out.println(numbers);

	}

}

