package com.nit.collection.day10;

import java.util.HashMap;
import java.util.Scanner;

public class FruitInventoryManagement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<String,Integer> fruits=new HashMap<>();
		fruits.put("Apple", 50);
		fruits.put("Banana",30);
		fruits.put("Kiwi", 20);
		fruits.put("Grapes", 10);
		fruits.put("Orange", 20);
		fruits.put("Orange", 60);  //not acceptable
		
		
		System.out.println(fruits);
		System.out.println("Total no. of Entrie : "+fruits.size());
		
		
		if(!fruits.isEmpty())
		{
			System.out.println("Fruits are not empty");
		}
		else 	System.out.println("Fruits are empty");

		
				
		System.out.println("Enter the fruit name for quantity : ");
		String f=sc.nextLine();	
		System.out.println("Quantity for "+f+" : "+fruits.get(f));
	
		
	
		System.out.println("Enter the record you want to search : ");
		String fruit=sc.nextLine();	
		if(fruits.containsKey(fruit))
		{
			System.out.println(fruit+" exists in the record");
		}
		else {
			System.out.println(fruit+" doesn't exists in the record");			
		}
		
		
		
		
		System.out.println("Enter the Quantity you want to search : ");
		int qty=sc.nextInt();
		if(fruits.containsValue(qty))
		{
			System.out.println("Quantity "+qty+" exist in the records");
		}
		else 
			System.out.println("Quantity "+qty+" doesn't exist in the records");
		
		
		
		
	}
}
