package com.nit.collection.day1;

import java.util.ArrayList;

public class ArraayListTest2 {
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>();
//		list.add(null);
//		list.add(0, "A");
//		list.add(3, "B");
//		list.add(1, "C");
//		System.out.println(list);	// java.lang.IndexOutOfBoundsException: Index: 3, Size: 2
		
//		 list.add(null);      // Adds `null` at index 0
//	        list.add(0, "A");    // Inserts "A" at index 0, shifting `null` to index 1
//	        list.add(3, "B");    // ERROR: Index 3 is out of bounds
//	        list.add(1, "C");    // Inserts "C" at index 1, shifting `null` to index 2

		
//		 list.add(null);
//		 list.add(0, "A");
//		 list.add(2, "B");
//		 list.add(1, "C");
//		 System.out.println(list);	// [A, C, null, B]

		
		
//		 list.add(null);
//		 list.add(0, "A");
//		 list.add(null);
//		 list.add(2, "B");
//		 list.add("20");
//		 list.add(1, "C");
//		 System.out.println(list);	// [A,C,null,B,null,20]
	
	
		
//		 list.add(null);
//		 list.add(0, "A");
//		 list.add(2, "B");
//		 list.add("20");
//		 list.add(1, "C");
//		 System.out.println(list);	// [A,C,null,B,20]

	
		
//		 list.add(12);
//		 list.add(16);
//		 list.add(34);
//		 list.add(78);
//		 list.remove(12);	// it will consider the 12 as the index position so it will throw exception
//		 System.out.println(list);	// java.lang.IndexOutOfBoundsException: Index 12 out of bounds for length 4

		
		
		 list.add('a');
		 list.add('b');
		 list.add('c');
		 list.add('d');
		 list.remove('c');
		 System.out.println(list);	// java.lang.IndexOutOfBoundsException: Index 99 out of bounds for length 4

	
//		 list.add(12);
//		 list.add(16);
//		 list.add(34);
//		 list.add(78);
//		 list.remove(Integer.valueOf(16));
//		 System.out.println(list);	// [12,34,78]

	}
}
