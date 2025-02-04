package com.nit.collection.day2;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample10 {
	public static void main(String[] argv) 
    {
          List<String> list = new ArrayList<String>();
          list.add("a");
          list.add("b");
          list.add("c");
          System.out.println(list.indexOf("a"));  // 0
          System.out.println(list.indexOf("c"));  // 2
          System.out.println(list.indexOf("d"));  // -1
    }

}
