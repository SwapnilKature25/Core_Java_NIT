package com.nit.collection.day3;

import java.util.ArrayList;

public class CabCustomerService {
		private ArrayList<CabCustomer> customers=new ArrayList<>();
		public void addCabCustomer(CabCustomer cb)
		{
			if(isFirstCustomer(cb))
			{
				customers.add(cb);
			}
		}
		
		public boolean isFirstCustomer(CabCustomer cb)
		{
			for (CabCustomer cabCustomer : customers) {
				if(cabCustomer.getPhone().equals(cb.getPhone()))
				{
					return true;  // cust already exist
				}
			}
			return false;			
		}
		
		public int calculateBill(CabCustomer cb)
		{
			if(isFirstCustomer(cb))
			{
				customers.add(cb);
				return 0;
			}
			else if(cb.getDistance() <= 4)
			{
				return 80;
			}
			else 
			{
				return 80+cb.getDistance()*6-4;
			}
		}
		
		public void printBill(CabCustomer cb)
		{
			
			System.out.println(cb.getCustomerName()+" Please pay your bill of Rs."+bill);
		}
		
}
		