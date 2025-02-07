package com.nit.collection.list;

import java.util.ArrayList;

public class ArrayListDemo8
{
    public static void main(String[] args) 
    {
        ArrayList<String> original = new ArrayList<>();
        original.add("BCA");
        original.add("MCA");
        original.add("BBA");

//       1) By using clone() method
         @SuppressWarnings("unchecked")
		ArrayList<String> duplicate =(ArrayList<String>) original.clone();
         System.out.println(duplicate);
            
//		 2) By using constructor (Loose Coupilng)
         ArrayList<String> copy = new ArrayList<>(original);
         System.out.println(copy);  
    }
}