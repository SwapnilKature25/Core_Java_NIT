package com.nit.Encapsulation;


 class Product 
{
	private int productId;
	private String productName;
	private double productPrice;

	public Product(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	
	public static Product getProductObject()
	{
		return  new Product(111, "Laptop", 92000.90);		
	}

}


public class FactoryMethod {

	public static void main(String[] args)
	{
		Product product = Product.getProductObject();				
		System.out.println(product);
		System.out.println( Product.getProductObject());
	}

}
