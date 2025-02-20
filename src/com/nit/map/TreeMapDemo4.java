package com.nit.map;

//firstKey()  lastKey()  headMap()  tailMap()  subMap()      SortedMap
//first()     last()     headSet()  tailSet()  subSet()     SortedSet

import java.util.*;
public class TreeMapDemo4
{
 public static void main(String[] argv) 
 {
     Map<String,String> map = new TreeMap<String,String>();  
     map.put("key2", "value2");
     map.put("key3", "value3");
     map.put("key1", "value1");

     System.out.println(map); //

     SortedMap x = (SortedMap) map;
     System.out.println("First key is :"+x.firstKey());
     System.out.println("Last Key is :"+x.lastKey()); 
  }
}