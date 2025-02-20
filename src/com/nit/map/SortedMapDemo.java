package com.nit.map;

import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
	public static void main(String[] args) {
		HashMap<Integer,String> hs=new HashMap<>();
		hs.put(123, "Apple");
		hs.put(121, "Orange");
		hs.put(124, "Grapes");
		hs.put(111, "Kiwi");
		System.out.println(hs);
		hs.forEach((k,v)-> System.out.println(k+" "+v));
		
		SortedMap<Integer,String> sm=new TreeMap<Integer,String>();
		sm.put(123, "Apple");
		sm.put(121, "Orange");
		sm.put(124, "Grapes");
		sm.put(111, "Kiwi");
		System.out.println(sm);
		sm.forEach((k,v)-> System.out.println(k+" "+v));
		
	}
}
