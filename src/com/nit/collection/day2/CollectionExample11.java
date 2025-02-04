package com.nit.collection.day2;

import java.util.LinkedList;
import java.util.Vector;

public class CollectionExample11 {
	 public static void main(String[] args)
     {
           Integer int1 = new Integer(10);
           Vector vec1 = new Vector();
           LinkedList list = new LinkedList();
           vec1.add(int1);
           list.add(int1);
           if(vec1.equals(list)) // true
                System.out.println("equal");  // equal
           else  
                System.out.println("not equal");
     }

}
