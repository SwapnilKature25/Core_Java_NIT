package com.nit.collection.day9;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Test2 {
	public static void main(String[] args) {
		/*
		TreeSet<Integer> times = new TreeSet<Integer>();
        times.add(705);
        times.add(509);
        times.add(645);
        times.add(830);
        times.add(1010);
        times.add(1100);    
        TreeSet<Integer> subset = new TreeSet<Integer>();
//      SortedSet<Integer> subset = new TreeSet<Integer>();
        subset = (TreeSet<Integer>) times.headSet(800);			
        System.out.println(subset);   // [509, 645, 705]
        System.out.println(subset.first());  // 509
        System.out.println(subset.last());  // 705
		*/
		
		
//		 TreeSet set = new TreeSet();
//         for (int i = 0; i < 5; i++)
//              set.add(Math.random());
//
//         Iterator iter = set.iterator();
//         while (iter.hasNext())
//              System.out.println(iter.next());


		
		 TreeSet<Integer> times = new TreeSet<Integer>();
         times.add(1205);
         times.add(1505);
         times.add(1545);
         times.add(1830);
         times.add(2010);
         times.add(2100);
 
         TreeSet<Integer> subset = new TreeSet<Integer>();
         subset = (TreeSet) times.headSet(1600);
         System.out.println(subset);    //  1205 1505 1545
         System.out.println(subset.first());  //1205
         System.out.println(subset.last());   // 1545
         System.out.println(subset.lower(1500)); //1205
         System.out.println(subset.higher(1500));  // 1505

	}
}
