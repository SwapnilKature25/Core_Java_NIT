package com.nit.streaminputoutput;

import java.io.EOFException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Scanner;


class Product implements Serializable
{
	private transient Integer productId;
	private String productName;
	private LocalDate manufacturedDate;

	public Product(Integer productId, String productName, LocalDate manufacturedDate) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.manufacturedDate = manufacturedDate;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", manufacturedDate="
				+ manufacturedDate + "]";
	}
	
	
	public static Product getProductObject()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Product Id :");
		int pid = sc.nextInt();
		System.out.print("Enter Product Name :");
		String pname = sc.nextLine();
		pname = sc.nextLine();
		LocalDate now = LocalDate.now();
		
		return new Product(pid, pname, now);
	}
	

}

public class StoreProductObject {
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		Scanner sc=new Scanner(System.in); 
		var fos = new FileOutputStream("C:\\Users\\swapn\\SerializationDeserial\\StoreProdObj.txt");
		var oos = new ObjectOutputStream(fos);
		try(oos; fos)
		{
			System.out.println("Enter how many obj u want to store : ");
			int obj=sc.nextInt();
			for(int i=1; i<=obj; i++)
			{
				Product productObject = Product.getProductObject();
				oos.writeObject(productObject);
			}
			System.out.println("Product data successfully stored...");
		}
		catch(EOFException e)
		{
			System.err.println("End of file has reached");
		}
		
	}
}
