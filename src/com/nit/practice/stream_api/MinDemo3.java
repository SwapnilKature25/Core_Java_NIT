package com.nit.practice.stream_api;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//Finding the Cheapest Product

record Products(Integer productId, String productName, Double productPrice)
{
	
}


public class MinDemo3 {

	public static void main(String[] args)
	{
		var p1 = new Products(111, "Camera", 45000D);
		var p2 = new Products(222, "Watch", 23000D);
		var p3 = new Products(333, "HeadPhone", 2000D);
		var p4 = new Products(444, "Keyboard", 500D);
		
		List<Products> listOfProduct = List.of(p1,p2,p3,p4);
	
		Optional<Products> min = listOfProduct.stream().
		        min(Comparator.comparingDouble(Products::productPrice));
	
	
		min.ifPresent(System.out::println);
	
	}

}