package com.nit.collection.day7;

import java.util.ArrayList;
import java.util.Collections;

class Product implements Comparable<Product>
{
	private Integer productNumber;
	private String productName;
	private Double productPrice;
	public Product(Integer productNumber, String productName, Double productPrice) {
		super();
		this.productNumber = productNumber;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	@Override
	public int compareTo(Product o) {
		
		return this.productName.compareTo(o.productName);
	}
	@Override
	public String toString() {
		return "Product [productNumber=" + productNumber + ", productName=" + productName + ", productPrice="
				+ productPrice + "]";
	}

}

public class ProductDemo
{
	public static void main(String[] args) {
		ArrayList<Product> products=new ArrayList<>();
		products.add(new Product(111,"Mobile",20000D));
		products.add(new Product(112,"Laptop",50000D));
		products.add(new Product(113,"Mac",100000D));
		
		System.out.println("Products before sorting");
		products.forEach(System.out::println);
		
		System.out.println("Products After sorting based on Name");
		Collections.sort(products);
		products.forEach(x -> System.out.println(x));
	}
}




