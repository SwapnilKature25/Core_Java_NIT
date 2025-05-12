package com.nit.collection.generics;

//Mixing generic to non-generic
import java.util.*; 
public class GenericTest8 
{
	public static void main(String[] args) 
	{ 
		List<Integer> myList = new ArrayList<>();	

		myList.add(4); 
		myList.add(6); 
		UnknownClass2 u = new UnknownClass2(); 
		int total = u.addValues(myList); 
		System.out.println(total);   //15
	} 
}  
class UnknownClass2
{ 
  public int addValues(List list)  
	{ 
		list.add(5);	//adding object to raw type  -> warning message
		Iterator it = list.iterator(); 
		int total = 0; 
		while (it.hasNext()) 
		{
		int i = ((Integer)it.next()); 
		total += i; 
		} 
		list.forEach(System.out::println);
		return total; 
	} 
} 

//Here Compiler will generate warning message because the unsafe object is inserting 
//the value 5 to safe object.