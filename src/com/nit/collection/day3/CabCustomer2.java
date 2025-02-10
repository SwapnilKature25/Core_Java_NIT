package com.nit.collection.day3;

public class CabCustomer2 {
    private int custId;
    private String customerName;
    private String pickupLocation;
    private String dropLocation;
    private int distance;
    private String phone;

    // No-argument constructor
    public CabCustomer2() {
    }

    // Parameterized constructor
    public CabCustomer2(int custId, String customerName, String pickupLocation, String dropLocation, int distance, String phone) {
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