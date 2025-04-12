package com.nit.collection.generics;

import java.util.*;
import java.util.stream.Stream;
public class TypeErasure 
{
	public static void main(String[] args) 
	{	   	
	}
	
	public static void m1(List<Integer> list)  // Erasure of method m1(List<Integer>) is the same as another method in type TypeErasure
	{		
	}
	
	public static void m1(List<String> str)
	{		
	}	
	
	
}


//Note : In the above program we will get compilation error because 
//generic information does not exist at runtime so method overloading is not possible.
