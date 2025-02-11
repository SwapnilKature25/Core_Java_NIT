package com.nit.collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo2 {

	public static void main(String[] args) 
	{
		Boolean []arr = new Boolean[5];
		
		Set<Object> set = new HashSet<>();
		arr[0] =  set.add(12);
		arr[1] =  set.add(12);  //false
		arr[2] =  set.add(14);
		arr[3] =  set.add(14);  //false
		arr[4] =  set.add(15);
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Fetching the Data from Set ");
		
		set.forEach(obj -> System.out.println(obj));
		
		//Verify whether 15 is available or not ?
		
		if(set.contains(15))
		{
			System.out.println("15 is available");
		}
		else
		{
			System.out.println("It is not available");
		}
		
	}

}

/* [true, false, true, false, true]
Fetching the Data from Set 
12
14
15
15 is available */

