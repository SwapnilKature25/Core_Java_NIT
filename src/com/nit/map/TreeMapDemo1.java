package com.nit.map;


import java.util.TreeMap;

public class TreeMapDemo1 {

	public static void main(String[] args) 
	{
		TreeMap<Integer, String> tm1 = new TreeMap<>();
		tm1.put(4, "A");
		tm1.put(9, "B");
		tm1.put(1, "D");
		tm1.put(2, "Z");
		tm1.put(3, "X");
		
		tm1.forEach((k,v) -> System.out.println("Key is :"+k+" value is :"+v));
		
		

	}

}
