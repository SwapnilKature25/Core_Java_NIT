package com.nit.assignments.exception;

public class Product {
	private int id;
	private String name;
	private double price;
	private int quantity;
	
	public Product(int id, String name, double price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	
	public void decreaseQuantity(int qty) throws InsufficientQuantityException
	{
		if(qty == 0)
		{
			throw new InsufficientQuantityException("Quantity not available");
		}
		else {
			quantity-=qty;
		}
	}
	
}
