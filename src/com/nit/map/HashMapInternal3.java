package com.nit.map;

import java.util.HashMap;

record Manager(Integer id, String managerName)
{
	
}


public class HashMapInternal3 {

	public static void main(String[] args) 
	{
		Manager m1 = new Manager(111,"Alen");
		Manager m2 = new Manager(111,"Alen");
		
		HashMap<Manager,String> map = new HashMap<>();
		map.put(m1, "Ameerpet");
		map.put(m2, "S R Nagar");
		
		System.out.println(map.size()); //1
		

	}

}
