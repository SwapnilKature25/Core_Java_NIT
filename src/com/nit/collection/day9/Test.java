package com.nit.collection.day9;

import java.util.Set;
import java.util.TreeSet;

public class Test 
{
     public static void main(String[] a) 
     {
          Set<Apple> set = new TreeSet<Apple>();
          set.add(new Apple());
          set.add(new Apple());
          set.add(new Apple());
          System.out.println(set);  // java.lang.ClassCastException:
     }
}
class Apple 
{

}

/* Your code will throw a ClassCastException at runtime because Apple does not implement
 *  Comparable<Apple>, and TreeSet requires elements to be comparable
 *   to maintain its sorted order. */
 