package com.nit.collection.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 
{
    public static void main(String[] args) 
	{
       LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(10);
        linkedHashSet.add(5);
        linkedHashSet.add(15);
        linkedHashSet.add(20);
        linkedHashSet.add(5);
		

        System.out.println("LinkedHashSet elements: " + linkedHashSet);

        System.out.println("LinkedHashSet size: " + linkedHashSet.size()); //5

        int elementToCheck = 15;
        if (linkedHashSet.contains(elementToCheck))  /// true
		{
            System.out.println(elementToCheck + " is present in the LinkedHashSet.");  
        } 
		else 
		{
            System.out.println(elementToCheck + " is not present in the LinkedHashSet.");
        }

        int elementToRemove = 10;
        linkedHashSet.remove(elementToRemove);  // removed
        System.out.println("After removing " + elementToRemove + ", LinkedHashSet elements: " + linkedHashSet);

        linkedHashSet.clear(); 
        System.out.println("After clearing, LinkedHashSet elements: " + linkedHashSet); 
    }
}