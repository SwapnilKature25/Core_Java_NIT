package com.nit.collection.list;

//Searching an element in the Stack
import java.util.Stack;  //
public class StackDemo4
{  
	public static void main(String[] args)   //1  -1  false  2
		{  
		     
			Stack<String> stk= new Stack<>();  
			stk.push("Apple");  
			stk.push("Grapes");  
			stk.push("Mango"); 			
			stk.push("Pineapple"); 		
			System.out.println(stk);
			
			System.out.println("Offset Position is : " + stk.search("Mango")); //2			
			System.out.println("Offser Position is : " + stk.search("Banana")); //-1
		    System.out.println("Is stack empty ? "+stk.empty());	//false
			
			System.out.println("Index Position is : " + stk.indexOf("Pineapple")); //2
		}  
}  
