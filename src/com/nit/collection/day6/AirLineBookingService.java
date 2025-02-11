package com.nit.collection.day6;

import java.util.ArrayList;

public class AirLineBookingService {
	ArrayList<AirLineCustomer> customers=new ArrayList<>();
	
	public void bookFlight(AirLineCustomer cust)
	{
		customers.add(cust);
	}
	
	public boolean isFistTimeCustomer(AirLineCustomer cust)
	{
		for(AirLineCustomer al : customers)
		{
			if(al.getPhoneNumber().equals(cust.getPhoneNumber()))
			{
				return false;
			}
		}
		return true;
	}
	
	public int calculateBookingCost(AirLineCustomer cust)
	{
		if(this.isFistTimeCustomer(cust))
		{
			this.bookFlight(cust);
			return 0;
		}
		return 2000;
	}
	
	public void printBookingDetails(AirLineCustomer cust)
	{
		System.out.println(cust.getFullName()+" ur Booking request has been accepted, Please pay the booking cost of Rs."+this.calculateBookingCost(cust));
	}
}







