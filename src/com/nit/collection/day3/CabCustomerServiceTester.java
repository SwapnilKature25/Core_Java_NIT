package com.nit.collection.day3;

import java.util.ArrayList;

public class CabCustomerServiceTester {
	public static void main(String[] args) 
	{
		CabCustomerService services=new CabCustomerService();
		
		CabCustomer c1=new CabCustomer(111, "Swapnil","Ameerpet" , "Secunderabad", 4, "8767599695");
		CabCustomer c2=new CabCustomer(112, "Omkar","Ameerpet" , "Secunderabad", 3, "8767599695");
		CabCustomer c3=new CabCustomer(113, "Jane","Ameerpet" , "Secunderabad", 8, "8667569695");
		CabCustomer c4=new CabCustomer(114, "Mike","Ameerpet" , "Secunderabad", 9, "897569695");
		
		services.addCabCustomer(c1);
		services.printBill(c1);
		
//		services.addCabCustomer(c2);
		services.printBill(c2);
		services.printBill(c2);
		
		services.addCabCustomer(c3);
		services.printBill(c3);
		
		services.addCabCustomer(c4);
		services.printBill(c4);
	}
}
