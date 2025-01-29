package com.nit.interfaces.predefined_Classes;

import java.util.function.Consumer;

/* @FunctionalInterface
public interface Consumer<T>
{
    void accept(T x);
}
 */

class Customer
{
	private int customerId;

	public Customer(int customerId) 
	{
		super();
		this.customerId = customerId;
	}

	@Override
	public String toString() 
	{
		return "Customer [customerId=" + customerId + "]";
	}
}


public class ConsumerDemo1 {

	public static void main(String[] args) 
	{
		Consumer<Integer> c1 = num -> System.out.println("Integer type "+num);
	    c1.accept(12);	
	
	    Consumer<Boolean> c2 = bool -> System.out.println("Boolean Type :"+bool);
	    c2.accept(false);
	    
	    Consumer<Customer> c3 = cust -> System.out.println("Customer Type :"+cust);
	    c3.accept(new Customer(111));

	}
}



/* Integer type 12
Boolean Type :false
Customer Type :Customer [customerId=111] */