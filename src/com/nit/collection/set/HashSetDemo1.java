package com.nit.collection.set;

import java.util.HashSet;

public class HashSetDemo1
{
	public static void main(String[] argv) {
		HashSet<String> hs = new HashSet<>();
		hs.add("Ravi");
		hs.add("Vijay");
		hs.add("Ravi");
		hs.add("Ajay");
		hs.add("Palavi");
		hs.add("Sweta");
		hs.add(null);
		hs.add(null);
		hs.forEach(str -> System.out.println(str));

	}
}

/* null
Vijay
Ravi
Palavi
Sweta
Ajay
 */