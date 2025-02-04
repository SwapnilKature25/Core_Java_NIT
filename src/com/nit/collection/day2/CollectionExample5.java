package com.nit.collection.day2;

import java.util.ArrayList;

public class CollectionExample5 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("google");
		al.add("Naresh");
		al.add("Information");
		al.add("Technology");
		for(int i=0;i<al.size();i++) 
		{
//			get() will fetch a particular element from xyz index position 
			System.out.print(al.get(i).substring(0,6));		// googleNareshInformTechno
		}
	}
}
