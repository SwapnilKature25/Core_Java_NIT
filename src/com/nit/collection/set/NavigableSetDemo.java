package com.nit.collection.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo 
{   
    public static void main(String[] args)
    {
        NavigableSet<Integer> ns = new TreeSet<>(); 
        ns.add(1);
        ns.add(2);
        ns.add(3);
        ns.add(4);
        ns.add(5);
        ns.add(6);

		System.out.println("lower(3): " + ns.lower(3));//Just below than the specified element or null
		System.out.println("lower(1): " + ns.lower(1));//Just below than the specified element or null
     
       System.out.println("floor(3): " + ns.floor(3)); //Equal  less or null
       System.out.println("floor(0): " + ns.floor(0)); //Equal  less or null
     
       System.out.println("higher(3): " + ns.higher(6));//Just greater than specified element or null
       System.out.println("higher(1): " + ns.higher(1));//Just greater than specified element or null
   
       System.out.println("ceiling(3): " + ns.ceiling(3));//Equal or greater or null 
       System.out.println("ceiling(0): " + ns.ceiling(0));//Equal or greater or null 
       
       

        	
    }
}
