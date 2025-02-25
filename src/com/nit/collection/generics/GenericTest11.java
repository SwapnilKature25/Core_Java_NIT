package com.nit.collection.generics;

import java.util.*;
public class GenericTest11
{
public static void main(String [] args)
	{	
//	   ArrayList<Object> al = new ArrayList<String>();   // [Compile time ] //invalid with List
//	   ArrayList al1 = new ArrayList();    //[Runtime, Type Erasure]
//	   al1.add("Ravi");
	     

	   
		Object []obj = new String[3]; //valid with Array
		obj[0] = "Ravi";
		obj[1] = "hyd";
		obj[2] =  90; //java.lang.ArrayStoreException
		System.out.println(Arrays.toString(obj));
		
	}
}