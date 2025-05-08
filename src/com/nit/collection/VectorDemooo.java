package com.nit.collection;

import java.util.Collections;
import java.util.Vector;

public class VectorDemooo {

	public static void main(String[] args) 
	{
		Vector<String> listOfCity = new Vector<>();
		listOfCity.add("Hyderabad");
		listOfCity.add("Pune");
		listOfCity.add("Indore");
		listOfCity.add("Bhubneswar");
		listOfCity.add("Kolkata");
		
		System.out.println("Before Sorting :"+listOfCity);
		
        Collections.sort(listOfCity);
        
        System.out.println("After Sorting :"+listOfCity);
        
        //Remove the element based on the index position
        listOfCity.remove(2);
        System.out.println(listOfCity);
        
        //Remove based on the Object
        listOfCity.remove("Kolkata");
        System.out.println(listOfCity);
       
	}

}
