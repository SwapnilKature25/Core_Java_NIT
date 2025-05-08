package com.nit.Encapsulation;

class Customer1
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

public class PassByValueDemo3 
{
	public static void main(String[] args) 
	{
		Customer1 c1 = new Customer1();   // 1000x  //customerBill = 12000
		accept(c1);
		System.out.println(c1.getCustomerBill());  //      ////customerBill = 18000		
	}	
	
	public static void accept(Customer1 cust)
	{
		cust.setCustomerBill(18000);
	}
}
