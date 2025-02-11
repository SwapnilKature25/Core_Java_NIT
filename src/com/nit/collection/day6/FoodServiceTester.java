package com.nit.collection.day6;

public class FoodServiceTester {
	public static void main(String[] args) {
		FoodOrderService order=new FoodOrderService();
		
		FoodCustomer cust1=new FoodCustomer(121,"Itachi","866885845");
		FoodCustomer cust2=new FoodCustomer(122,"Sasuke","866885845");
		
		order.printBill(cust1,200);
		order.printBill(cust2,200);
		
	}
}	
