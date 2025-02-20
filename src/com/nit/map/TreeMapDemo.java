package com.nit.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		
		SortedMap<Integer,String> sm=new TreeMap<Integer,String>();
		sm.put(123, "Apple");
		sm.put(121, "Orange");
		sm.put(124, "Grapes");
		sm.put(111, "Kiwi");
		System.out.println(sm);
//		sm.forEach((k,v)-> System.out.println(k+" "+v));
		System.out.println();
		
		TreeMap<Integer,String> tm=new TreeMap<>(sm);
		tm.put(112, "Gauva");
		tm.put(121, "Pineapple");
		tm.put(113, "Banana");
		tm.put(111, "Kiwi");
		System.out.println(tm);
//		tm.forEach((k,v)-> System.out.println(k+" "+v));
	}
}	
