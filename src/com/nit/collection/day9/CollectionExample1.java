package com.nit.collection.day9;

import java.util.Set;
import java.util.TreeSet;

public class CollectionExample1 {
	public static void main(String[] args) {
		/*
		TreeSet<String> tree = new TreeSet<>();
		tree.add("25");
		tree.add("Naresh");
		tree.add("A");
		tree.add("37");
		for(String str: tree)
			System.out.print(str+" ");  // 25 37 A Naresh
		*/
		
		/*
		Set<String> tree = new TreeSet<>();
		tree.add("25");
		tree.add("Naresh");
		tree.add("A");
		tree.add("37");
		for(String str: tree)
			System.out.print(str+" ");  // 25 37 A Naresh 
		*/
		
		
		Set<String> tree = new TreeSet<>();
		tree.add("google");
		tree.add("Naresh");
		tree.add("Information");
		tree.add("Technology");
		for(int i=2;i<tree.size();i++) 
		{
//			System.out.print(tree.remove(i));
			
		}
//		System.out.println(tree);

		
		
		Set<String> tree2 = new TreeSet<>();
		tree2.add("google");
		tree2.add("Naresh");
		tree2.add("Information");
		tree2.add("Technology");		
		for(String str: tree2) 
		{
			if(tree2.contains("Naresh")) {
				System.out.print(str+" ");   // Information Naresh Technology google 
			}
		}

		
	}
}

