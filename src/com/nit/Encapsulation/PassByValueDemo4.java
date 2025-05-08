package com.nit.Encapsulation;

class Customer2
{
	private double customerBill = 12000;

	public double getCustomerBill() 
	{
		return customerBill;
	}

	public void setCustomerBill(double customerBill) 
	{
		this.customerBill = customerBill;
	}
	
}

public class PassByValueDemo4 
{
	public static void main(String[] args) 
	{
		Customer2 c1 = new Customer2();  //customerBill = 12000	 , c1 = 1000x	
//		accept(c1);
		Customer2 c2 = accept(c1);
		System.out.println(c1.getCustomerBill()); //12000	
		System.out.println(c2.getCustomerBill()); //12000	
	}	
	
	public static Customer2 accept(Customer2 cust)   // cust = 1000x
	{  
		cust = new Customer2();    // cust = 2000x
		cust.setCustomerBill(18000);  // new cust custBill = 18000
		return cust;
	}
}