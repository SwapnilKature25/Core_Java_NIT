package com.nit.exception;

import java.util.Objects;

class ProductClass 
{
	private Integer productId;
	private String productName;

	public ProductClass(Integer productId, String productName) 
	{
		super();
		this.productId = productId;
		this.productName = productName;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "ProductClass [productId=" + productId + ", productName=" + productName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(productId, productName);
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductClass other = (ProductClass) obj;
		return Objects.equals(productId, other.productId) && Objects.equals(productName, other.productName);
	}
}
 
 record ProductRecord(Integer productId, String productName)
{
	
	//to validate Outer world data (Compact constructor)	
	public ProductRecord
	{
	   if(productId <= 0)
	   {
		   System.err.println("Invalid Id");
	   }
	   
	}

}

public class RecordDemo {

	public static void main(String[] args) 
	{
		ProductClass p1 = new ProductClass(111, "Camera");
		System.out.println(p1);
		ProductClass p2 = new ProductClass(111, "Camera");
		System.out.println(p1.equals(p2));
		System.out.println(p1.getProductName());
		
		
		
		System.out.println("....................................");
		ProductRecord r1 = new ProductRecord(999, "Laptop");
        System.out.println(r1);
        ProductRecord r2 = new ProductRecord(999, "Laptop");
        System.out.println(r1.equals(r2));
        System.out.println(r1.productName());
	}

}
