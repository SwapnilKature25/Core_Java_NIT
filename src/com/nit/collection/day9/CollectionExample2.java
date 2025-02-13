package com.nit.collection.day9;

import java.util.HashSet;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionExample2 {
	public static void main(String[] args) {
		/*
		HashMap hash = new HashMap<>();
		hash.put("nit", 500);
		hash.put("info", 644);
		hash.put("tech", "google");
		System.out.println(hash.get("tech"));  // google
		System.out.println(hash.get("google")); // null
		System.out.println(hash.getOrDefault("nit", "Technology")); //500
		System.out.println(hash.get("info"));  //644
		*/
		
		
		HashSet hash = new HashSet<>();
		hash.add("nit");
		hash.add("nit");
		hash.add("NIT");
//		System.out.println(hash); // [nit, NIT]
//		System.out.println(hash.size()); // 2
		
		
		HashSet set = new HashSet<>();
		set.add(new StringBuffer("nit"));
		set.add(new StringBuffer("nit"));   
		System.out.println(set);    // [nit, nit]
		System.out.println(set.size());  // 2
	
	
		TreeSet tree = new TreeSet<>();
		tree.add("nit");
		tree.add("Naresh");
		tree.add("25");
		System.out.println(tree.tailSet("a"));  //nit

		
		
//		TreeSet tree2 = new TreeSet<>();
//		tree2.add("nit");
//		tree2.add("Naresh");
//		tree2.add("Technology");
//		System.out.println(tree2.tailSet("a"));  //nit

		
		
		SortedMap smap = new TreeMap();
		smap.put(101,"nit");
		smap.put(105,"Technology");
		smap.put(103,"Naresh");
		System.out.println(smap);  // {101=nit, 103=Naresh, 105=Technology}


		
		
		TreeSet tree3 = new TreeSet();
		tree3.add("nit");
		tree3.add("Technology");
		tree3.add("Naresh");
		System.out.println(tree3);
		System.out.println(tree3.descendingSet());  // [nit, Technology, Naresh]

	}

}
