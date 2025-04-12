package com.nit.Encapsulation;

class Customer
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

public class PassByValueDemo2
{
	public static void main(String[] args) 
	{
		Customer c1 = new Customer();  //customerBill = 12000
		accept(c1);
		System.out.println(c1.getCustomerBill()); ////customerBill = 18000		
	}	
	
	public static void accept(Customer cust)
	{
		cust.setCustomerBill(18000);
	}
}