package com.nit.collection.day2;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample13 {
	 public static void main(String[] args) 
     {
          List<Number> list = new ArrayList<Number>();
          list.add(7);
          list.add(8);
          list.add(7);
          Number index = list.get(Integer.valueOf(7));
          System.out.println(index);  // java.lang.IndexOutOfBoundsException: Index 7 out of bounds for length 3
      }

}
