package com.nit.collection.set;


import java.util.*;
public class SortedSetMethod
{
       public static void main(String[] args) 
       {
    	   TreeMap s=null;
            TreeSet<Integer> times = new TreeSet<>();
            times.add(1205);
            times.add(1505);
            times.add(1545);
			times.add(1600);
            times.add(1830);
            times.add(2010);
            times.add(2100);
            
            System.out.println(times);    // [1205, 1505, 1545, 1600, 1830, 2010, 2100]
            SortedSet<Integer> sub = new TreeSet<>();
            
			sub =  times.subSet(1545,2100); 
            System.out.println("Using subSet() :-"+sub);//[1545, 1600,1830,2010]
            System.out.println(sub.first());
            System.out.println(sub.last());   
			
		    sub = times.headSet(1545); 
			System.out.println("Using headSet() :-"+sub); //[1205, 1505]
           
		     sub =  times.tailSet(1545); 
			 System.out.println("Using tailSet() :-"+sub); //[1545 to 2100] 
			 
			 
			 System.out.println();
			 System.out.println(times);
			 System.out.println("first :"+times.first());
			 System.out.println("last : "+times.last());
			 System.out.println("headSet() : "+times.headSet(1505));
			 System.out.println("tailSet() : "+times.tailSet(1505));
			 
			 System.out.println("subSet() :"+ times.subSet(1545, 2100));
			 
       }
}