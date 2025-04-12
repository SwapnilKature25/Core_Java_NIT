package com.nit.Encapsulation;
//The following program explains how to copy the content of one object of same class to another object of same class only.

class Product1
{
	private int productId;
	private String productName;

	public Product1(int productId, String productName) 
	{
		super();
		this.productId = productId;
		this.productName = productName;
	}
	
	public Product1(Product1 p)  //p = prod
	{
		this.productId = p.productId;
		this.productName = p.productName;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + "]";
	}
}


public class CopyConstructor2
{
	public static void main(String[] args) 
	{
		Product1 prod = new Product1(101, "HP Laptop");
		Product1 p1 = new Product1(prod);
		
		System.out.println(prod);
		System.out.println(p1);

	}

}

//Product [productId=101, productName=HP Laptop]
//Product [productId=101, productName=HP Laptop]

