package com.nit.stream_api.day4;

import java.util.Arrays;
import java.util.List;

//Provide flattening for different products data

class Product
{
	private Integer productId;
	private List<String> listOfProducts;
	
	public Product(Integer productId,List<String> listOfProducts)
	{
		this.productId=productId;
		this.listOfProducts=listOfProducts;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public List<String> getListOfProducts() {
		return listOfProducts;
	}

	public void setListOfProducts(List<String> listOfProducts) {
		this.listOfProducts = listOfProducts;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", listOfProducts=" + listOfProducts + "]";
	}
	
}

public class FlatMapDemo5 {
	public static void main(String[] args) {
		List<Product> listOfProduct=Arrays.asList(
				new  Product(1, Arrays.asList("Camera","Laptop", "Mobile")),
				new  Product(2, Arrays.asList("Pen","Paper", "Pencil")),
				new  Product(3, Arrays.asList("Ball","Bat", "Wicket"))				
				);
		
		List<String> list=listOfProduct.stream()
						.flatMap(prod -> prod.getListOfProducts().stream()).toList();
		System.out.println(list);
		
	}
}
