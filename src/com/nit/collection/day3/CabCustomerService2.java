package com.nit.collection.day3;

import java.util.ArrayList;

public class CabCustomerService2 {
    private ArrayList<CabCustomer2> customerList = new ArrayList<>();

    // Method to add customer
    public void addCabCustomer(CabCustomer2 customer) {
        customerList.add(customer);
    }

    // Method to check if customer is first-time
    public boolean isFirstCustomer(CabCustomer2 customer) {
        for (CabCustomer2 existingCustomer : customerList) {
            if (existingCustomer.getPhone().equals(customer.getPhone())) {
                return false; // Existing customer
            }
        }
        return true; // New customer
    }

    // Method to calculate bill
    public double calculateBill(CabCustomer2 customer) {
        if (isFirstCustomer(customer)) {
            return 0;
        }
        int distance = customer.getDistance();
        return (distance <= 4) ? 80 : (80 + (distance * 6));
    }
    
    // Method to print bill
    public void printBill(CabCustomer2 customer) {
        double bill = calculateBill(customer);
        System.out.println(customer.getCustomerName() + " Please pay your bill of Rs." + bill);
    }
}