package com.nit.collection.day3;

public class CabCustomerServiceTester2 {
    public static void main(String[] args) {
        CabCustomerService2 service = new CabCustomerService2();
        
        // Creating customers
        CabCustomer2 customer1 = new CabCustomer2(101, "JOHN", "A", "B", 5, "9876543210");
        CabCustomer2 customer2 = new CabCustomer2(102, "SMITH", "C", "D", 6, "9876543211");
        CabCustomer2 customer3 = new CabCustomer2(103, "JOHN", "A", "B", 4, "9876543210");
        
        // Adding customers to service
        service.addCabCustomer(customer1);
        service.addCabCustomer(customer2);
        
        // Printing bills
        service.printBill(customer1); // New customer -> Rs.0
        service.printBill(customer2); // New customer -> Rs.0
        service.printBill(customer3); // Existing customer -> Rs.80
    }
}