package com.nit.collection.day10;

import java.util.HashMap;
import java.util.LinkedList;

public class FruitsInventoryManagement2 {
	public static void main(String[] args) {
		HashMap<String,Integer> fruits1=new HashMap<>();
		fruits1.put("Apple", 50);
		fruits1.put("Banana",30);
		fruits1.put("Kiwi", 20);
		
		HashMap<String,Integer> fruits2=new HashMap<>();
		fruits2.put("Grapes", 10);
		fruits2.put("Orange", 20);
		fruits2.put("Pomegranate", 30);
		System.out.println("After using putAll() :");
		fruits1.putAll(fruits2);
		System.out.println(fruits1);
		System.out.println();
		
		System.out.println("After using putIfAbsent() :");
		fruits2.putIfAbsent("Orange", 20);  // it will accept only if it is not present in hashMap
		System.out.println(fruits1);
		System.out.println("Size of HashMap After merging : "+fruits1.size());
		System.out.println();
		
		
		System.out.println();
		
		System.out.println("After using replace() :");
		fruits1.replace("Orange", 60);
		System.out.println(fruits1);

		System.out.println();
		System.out.println("After using remove() :");
		fruits1.remove("Kiwi");
		System.out.println(fruits1);

		System.out.println();
		fruits2.forEach((x,y)->System.out.println(x+" "+y));
		
		
		
			
	}
}
