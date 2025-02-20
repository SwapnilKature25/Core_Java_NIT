package com.nit.collection.generics;
// Note : Even we are accepting only Integer type of Object but still type casting is required.
import java.util.*;
public class GenericTest1 
{
	public static void main(String[] args) 
	{
        ArrayList al = new ArrayList();
		al.add(12);
		al.add(15);
		al.add(18);
		al.add(22);
		al.add(24);

		for (int i=0; i<al.size(); i++)
		{
             Integer x = (Integer) al.get(i);
			 System.out.println(x);
		}

    }

}
