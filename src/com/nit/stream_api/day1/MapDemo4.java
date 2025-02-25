package com.nit.stream_api.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//WAP to fetch only the name of the product from the product object

record Product(Integer pid, String pname)
{
	
}

public class MapDemo4 
{
	public static void main(String[] args) {
		
		//Fetch 
		Set<String> collect = getProductList().stream().map(product -> product.pname()).collect(Collectors.toSet());
		System.out.println(collect);
	}
	
	public static List<Product> getProductList()
	{
		ArrayList<Product> listOfProd = new ArrayList<>();
		listOfProd.add(new Product(111,"Camera"));
		listOfProd.add(new Product(555,"Mobile"));
		listOfProd.add(new Product(444,"Laptop"));
		listOfProd.add(new Product(222,"Headphone"));
		
		return listOfProd;
	}
}
