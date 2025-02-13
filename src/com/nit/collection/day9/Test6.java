package com.nit.collection.day9;

import java.util.*;

class Test6 {
	public static void main(String[] args) {
		/*
		NavigableSet<Integer> set = new TreeSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(4);
		for (Iterator iterator = set.descendingSet().iterator(); iterator.hasNext();) {
			System.out.format("%d ", iterator.next()); // 4 2 1
		}
		*/
		
		
		/*
		 Set set = new TreeSet();
         set.add("2");
         set.add(3);
         set.add("1");
         Iterator it = set.iterator();
         while (it.hasNext())
              System.out.print(it.next() + " ");   // ClassCastException
         */
		
         
         HashSet set = new HashSet();
         String s1 = "abc";
         String s2 = "def";
         String s3 = "";
         set.add(s1);
         set.add(s2);
         set.add(s1);
         set.add(s2);
         Iterator i = set.iterator();
         while(i.hasNext())
         {
              s3 += (String) i.next();
         }
         System.out.println(s3);  // abcdef


         
         
	}
}
