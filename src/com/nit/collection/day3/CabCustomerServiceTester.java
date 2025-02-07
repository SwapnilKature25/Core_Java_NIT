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


/* import java.util.ArrayList;

// CabCustomer class
class CabCustomer {
    private int custId;
    private String customerName;
    private String pickupLocation;
    private String dropLocation;
    private int distance;
    private String phone;

    // No-argument constructor
    public CabCustomer() {
    }

    // Parameterized constructor
    public CabCustomer(int custId, String customerName, String pickupLocation, String dropLocation, int distance, String phone) {
        this.custId = custId;
        this.customerName = customerName;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.distance = distance;
        this.phone = phone;
    }

    // Getters and Setters
    public int getCustId() { return custId; }
    public void setCustId(int custId) { this.custId = custId; }
    
    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    
    public String getPickupLocation() { return pickupLocation; }
    public void setPickupLocation(String pickupLocation) { this.pickupLocation = pickupLocation; }
    
    public String getDropLocation() { return dropLocation; }
    public void setDropLocation(String dropLocation) { this.dropLocation = dropLocation; }
    
    public int getDistance() { return distance; }
    public void setDistance(int distance) { this.distance = distance; }
    
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
}

// CabCustomerService class
class CabCustomerService {
    private ArrayList<CabCustomer> customerList = new ArrayList<>();

    // Method to add customer
    public void addCabCustomer(CabCustomer customer) {
        customerList.add(customer);
    }

    // Method to check if customer is first-time
    public boolean isFirstCustomer(CabCustomer customer) {
        for (CabCustomer existingCustomer : customerList) {
            if (existingCustomer.getPhone().equals(customer.getPhone())) {
                return false; // Existing customer
            }
        }
        return true; // New customer
    }

    // Method to calculate bill
    public double calculateBill(CabCustomer customer) {
        if (isFirstCustomer(customer)) {
            return 0;
        }
        int distance = customer.getDistance();
        return (distance <= 4) ? 80 : (80 + (distance * 6));
    }

    // Method to print bill
    public void printBill(CabCustomer customer) {
        double bill = calculateBill(customer);
        System.out.println(customer.getCustomerName() + " Please pay your bill of Rs." + bill);
    }
}

// CabCustomerServiceTester class
public class CabCustomerServiceTester {
    public static void main(String[] args) {
        CabCustomerService service = new CabCustomerService();
        
        // Creating customers
        CabCustomer customer1 = new CabCustomer(101, "JOHN", "A", "B", 5, "9876543210");
        CabCustomer customer2 = new CabCustomer(102, "SMITH", "C", "D", 6, "9876543211");
        CabCustomer customer3 = new CabCustomer(103, "JOHN", "A", "B", 4, "9876543210");
        
        // Adding customers to service
        service.addCabCustomer(customer1);
        service.addCabCustomer(customer2);
        
        // Printing bills
        service.printBill(customer1); // New customer -> Rs.0
        service.printBill(customer2); // New customer -> Rs.0
        service.printBill(customer3); // Existing customer -> Rs.80
    }
}
 */

