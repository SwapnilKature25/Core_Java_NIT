package com.nit.collection.day5;

import java.util.*;

public class MergingCollections {
	public static void main(String[] args) {
		List<String> lst=new ArrayList<>();
//		List<String> lst2=new ArrayList<>();
		lst.add("Orange");
		lst.add("Grapes");
		lst.add("Apple");
		lst.add("Kiwi");
		
		// 1st way to merge two collections
		List<String> lst2=new ArrayList<>(lst);
		lst2.add("CustardApple");
		lst2.forEach(t -> System.out.println(t));
		
		System.out.println();
		System.out.println();
		
		
		// 2nd way		
		List<String> lst3=new ArrayList<>();
		lst3.addAll(lst2);
		lst3.add("Pineapple");
		lst3.forEach(p -> System.out.println(p));

		
	}
	
}
