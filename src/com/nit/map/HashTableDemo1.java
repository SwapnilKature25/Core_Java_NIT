package com.nit.map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo1
{  
 public static void main(String args[])
	{  
	  Hashtable<Integer,String> map=new Hashtable<>(); 
	  map.put(1, "Java");
	  map.put(2, "is");
	  map.put(3, "best");		
	  map.put(4,"language");
	  
	  //map.put(5,null);  

	  System.out.println(map);  // {4=language, 3=best, 2=is, 1=Java}


	  System.out.println(".......................");

	    for(Map.Entry m : map.entrySet())
		 {  
			 System.out.println(m.getKey()+" = "+m.getValue());  
		} 
    }  
}  