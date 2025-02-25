package com.nit.collection.generics.day1;

import java.util.ArrayList;

public class GenericMCQ2 {
	public static void main(String[] args) 
	  {	
//		ArrayList al = new ArrayList<>();
//			  
//		al.add("Naresh"); 
//		al.add(1);
//		al.add("Technologies");
//		String name = (String)al.get(0);
//		int n=(int) al.get(1);
//		System.out.println(name);
//		System.out.println(n);
//		
		
		 ArrayList<String> al = new ArrayList<String>();		  
		  al.add("Naresh"); 
//		  al.add(1);  // The method add(int, String) in the type ArrayList<String> is not applicable for the arguments (int)
		  al.add("Technologies");
		  String name = al.get(1);
		  System.out.println(name);	
		
	   }

}
