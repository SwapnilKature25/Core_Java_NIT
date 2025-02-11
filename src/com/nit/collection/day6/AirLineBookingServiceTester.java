package com.nit.collection.day6;

public class AirLineBookingServiceTester {
	public static void main(String[] args) {
		AirLineBookingService booking=new AirLineBookingService();
		
		AirLineCustomer cust1=new AirLineCustomer(211,"Itachi Uchicha","iuchiha@gmail.com", "8786858445");
		AirLineCustomer cust2=new AirLineCustomer(212,"Sasuke Uchicha","suchiha@gmail.com", "8786858445");
		
		booking.printBookingDetails(cust1);
		booking.printBookingDetails(cust2);
	}
}
