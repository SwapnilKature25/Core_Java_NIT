package com.nit.collection.day3;

import java.util.ArrayList;

public class CabCustomerService {
		private ArrayList<CabCustomer> customers=new ArrayList<>();
		
		public void addCabCustomer(CabCustomer cb)
		{
			customers.add(cb);
			
		}
		
		public boolean isFirstCustomer(CabCustomer cb)
		{   
			int count=0;
			for (CabCustomer cabCustomer : customers) {
				if(cabCustomer.getPhone().equals(cb.getPhone()))
				{
					count++; // cust already exist
				}
			}
			return count>1 ? true : false;			
		}
		
		public int calculateBill(CabCustomer cb)
		{
			if(isFirstCustomer(cb))
			{
				//this.addCabCustomer(cb);
				return 0;
			}
			else {
//				if(cb.getDistance() <= 4)
//				{
					return 80;
//				} else 
//				{
//					return (80+cb.getDistance()*6-4);
//				}
			}
		}
		
		public void printBill(CabCustomer cb)
		{
//			customers.forEach(System.out::println);
			System.out.println(cb.getCustomerName()+" Please pay your bill of Rs."+calculateBill(cb));
		}
		
}
		