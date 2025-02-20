package com.nit.map;

/*  Assignment for NavigableMap Methods :
-------------------------------------
1) ceilingEntry(K key)
2) ceilingKey(K key)
3) floorEntry(K key)
4) floorKey(K key)
5) higherEntry(K key)
6) higherKey(K key)
7) lowerEntry(K key)
8) lowerKey(K key) */

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {
	public static void main(String[] args) {
		NavigableMap<Integer,String> nm=new TreeMap<>();
		nm.put(123, "Apple");
		nm.put(125, "Orange");
		nm.put(121, "Grapes");
		
		System.out.println(nm);
		
		System.out.println("ceilingEntry()  : "+nm.ceilingEntry(120)); //121=Grapes
		System.out.println("ceilingKey()  : "+nm.ceilingKey(120));  //121
		
		System.out.println("floorEntry()  : "+nm.floorEntry(120));  //null
		System.out.println("floorKey()  : "+nm.floorKey(123));  //123
		
		System.out.println("higherEntry()  : "+nm.higherEntry(123));  //125=Orange
		System.out.println("higherKey()  : "+nm.higherKey(123));  //125
		
		System.out.println("lowerEntry()  : "+nm.lowerEntry(123));  //121=Grapes
		System.out.println("lowerKey()  : "+nm.lowerKey(123));  //121=Grapes
		
		
		
	}
}
