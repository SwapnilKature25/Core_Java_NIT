package com.nit.interfaces.functionalInterface;

// Type parameter introduced in jdk 1.5v

class Accept<T>
{
	private T data;

	public Accept(T data) //Product data = 
	{
		super();
		this.data = data;
	}

	public T getData() 
	{
		return data;
	}	
}

public class TypeParameter
{
	public static void main(String[] args) 
	{		
	 // we can pass wrapper classes and user-defined classes to the type parameter <>
	   Accept<Integer> acceptInt = new Accept<Integer>(12);
       System.out.println("Integer type is :"+acceptInt.getData());
       
       Accept<Double> acceptDouble = new Accept<Double>(90.78);
       System.out.println("Double type is :"+acceptDouble.getData());
       

       Accept<Boolean> acceptBoolean = new Accept<Boolean>(false);
       System.out.println("Boolean type is :"+acceptBoolean.getData());
     
       // user defined class
       Accept<Product> acceptProduct = new Accept<Product>(new Product(111));
       System.out.println("Product type is :"+acceptProduct.getData());

	}
}


class Product
{
	private int productId;

	public Product(int productId) 
	{
		super();
		this.productId = productId;
	}

	@Override
	public String toString() 
	{
		return "Product [productId=" + productId + "]";
	}
	
}