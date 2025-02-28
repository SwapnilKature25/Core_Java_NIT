package com.nit.map.day4;

import java.util.HashMap;
import java.util.Map;

public class BufferTest {
	public static void main(String [] args)
	   {
		/* For small numbers (-128 to 127), Java reuses Integer objects, so == works.
			For numbers outside this range (like 128), Java creates new objects, 
			so == gives false, but .equals() still gives true because the values are the same.*/
	    Integer i1 = 128;
		Integer i2 = 128;		
		System.out.println(i1==i2);  //false
		System.out.println(i1.equals(i2)); //true
	    
		
		Map<Integer,String> map = new HashMap<>();
		map.put(128,"Ampt");
		map.put(new Integer(128),"Hyd");
		System.out.println(map.size()); //1

	   
	   }
}
