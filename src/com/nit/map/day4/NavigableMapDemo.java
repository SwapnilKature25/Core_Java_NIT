package com.nit.map.day4;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {
	 public static void main(String[] args)
     {
          NavigableMap<Integer, String> map = new TreeMap<Integer, String>();
          map.firstKey();
          System.out.println(map.size());  // java.util.NoSuchElementException
     }
}
