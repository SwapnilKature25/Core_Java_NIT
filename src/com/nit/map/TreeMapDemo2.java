package com.nit.map;

import java.util.TreeMap;

//Note : put() method, internally uses compareTo() method of Integer class to sort the key object in ascending order.

public class TreeMapDemo2
{
	public static void main(String[] args) 
	{
		TreeMap<Object,String> t = new TreeMap<>(); 
		t.put(4,"Ravi");
		t.put(7,"Aswin");
		t.put(2,"Ananya");
		t.put(1,"Dinesh");
		t.put(9,"Ravi");	
		t.put(3,"Ankita");
		t.put(5,null);
		//t.put("six", "Xyz");  invalid
//		t.put(null, "abc");  //invalid - .NullPointerException
		
		System.out.println(t);
	}
}

