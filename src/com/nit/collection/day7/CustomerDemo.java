package com.nit.collection.day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Customer 
{
	private Integer customerNumber;
	private String customerName;
	private Double customerBill;
	public Customer(Integer customerNumber, String customerName, Double customerBill) {
		super();
		this.customerNumber = customerNumber;
		this.customerName = customerName;
		this.customerBill = customerBill;
	}
	
	public Integer getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(Integer customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Double getCustomerBill() {
		return customerBill;
	}

	public void setCustomerBill(Double customerBill) {
		this.customerBill = customerBill;
	}

	@Override
	public String toString() {
		return "Customer [customerNumber=" + customerNumber + ", customerName=" + customerName + ", customerBill="
				+ customerBill + "]";
	}
	
}

public class CustomerDemo {
	public static void main(String[] args) {
		ArrayList<Customer> customers=new ArrayList<>();
		customers.add(new Customer(131,"Itachi",800000d));
		customers.add(new Customer(102,"Sasuke",700000d));
		customers.add(new Customer(113,"Jinwoo",300000d));
		
		System.out.println("Original Data");
		customers.forEach(x -> System.out.println(x));

		System.out.println();
		System.out.println("Sorted Data Based on Number");
		Collections.sort(customers,(p1,p2)->p1.getCustomerNumber()-p2.getCustomerNumber());
		customers.forEach(System.out::println);
		
		System.out.println();

		System.out.println("Sorted Data Based on Name");
		Collections.sort(customers, (p1,p2)->p1.getCustomerName().compareTo(p2.getCustomerName()));
		customers.forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("Sorted Data Based on Bill");
		Collections.sort(customers, (p1,p2)->p1.getCustomerBill().compareTo(p2.getCustomerBill()));
		customers.forEach(System.out::println);
		
	}
}
