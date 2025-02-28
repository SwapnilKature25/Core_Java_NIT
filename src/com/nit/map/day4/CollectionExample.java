package com.nit.map.day4;

import java.util.HashMap;

public class CollectionExample {
	 public static void main(String[] args) 
     {
	HashMap hash = new HashMap<>();
	hash.put("nit", 500);
	hash.put("info", 644);
	hash.put("tech", "google");
	System.out.println(hash.get("tech"));  //google
	System.out.println(hash.get("google"));  //null
	System.out.println(hash.getOrDefault("nit", "Technology")); //500
	System.out.println(hash.getOrDefault("nits", "Technology")); //Technology
	System.out.println(hash.get("info"));  //644
     }

}
