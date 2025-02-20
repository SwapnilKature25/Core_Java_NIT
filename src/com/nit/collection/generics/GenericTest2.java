package com.nit.collection.generics;

import java.util.*;
class GenericTest2 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList(); //raw type
		al.add("Ravi");
		al.add("Ajay");
		al.add("Vijay");
							
		for(int i=0; i<al.size(); i++)
		{
		String name =  (String) al.get(i); //type casting is required
		System.out.println(name.toUpperCase());
		}	
		
	}
}