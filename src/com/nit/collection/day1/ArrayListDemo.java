package com.nit.collection.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 ArrayListDemo {
	public static void main(String args[]) {
		ArrayList obj1 = new ArrayList();
		ArrayList obj2 = new ArrayList();
		obj1.add("A");
		obj1.add("B");
		obj2.add("A");
		obj2.add(1, "B");
		System.out.println(obj1.equals(obj2));	// true
		
		
		List<String> list = new ArrayList<String>();
		 list.add("Patna");
		 list.add(0, "New York");
		 list.add("Mumbai");
		 list.add(2, "Sydney");
		 System.out.println(list);		// [New York, Patna, Sydney, Mumbai]

		
		
	}
}
