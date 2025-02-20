package com.nit.map;


import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	public static void main(String[] args) 
	{
		HashMap<String,String> hm = new HashMap<>();
		hm.put("NIT", "Ameerpet");
		hm.put(new String("NIT"), "Hyderabad");
		System.out.println(hm.size()); //1
		System.out.println(hm);
		
		System.out.println("........................");
		
		IdentityHashMap<String,String> ihm = new IdentityHashMap<>();
		ihm.put("NIT", "Ameerpet");
		ihm.put(new String("NIT"), "Hyderabad");
		System.out.println(ihm.size());  //2
		System.out.println(ihm);
		

	}

}