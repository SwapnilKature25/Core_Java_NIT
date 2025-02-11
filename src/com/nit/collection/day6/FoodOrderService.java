package com.nit.collection.day6;

import java.util.ArrayList;

public class FoodOrderService {
	ArrayList<FoodCustomer> customers=new ArrayList<>();
	
	public void placeOrder(FoodCustomer cust)
	{
		customers.add(cust);
	}
	
	public boolean isFirstCustomer(FoodCustomer cust)
	{
		for (FoodCustomer fc : customers) {
			if(fc.getPhoneNo().equals(cust.getPhoneNo()))
			{
				return false;
			}
		}
		return true;
	}
	
	public int calculateBill(FoodCustomer cust)
	{
		if(this.isFirstCustomer(cust))
		{
			this.placeOrder(cust);
			return 0;
		}
		else 
		{
			return 100;
		}
	}
	
	public void printBill(FoodCustomer cust,double amount)
	{
		System.out.println(cust.getCustomerName()+" your ordered has been placed. Please pay Bill of Rs."+(calculateBill(cust)+amount));
	}
	
	
}

