package com.nit.Encapsulation;

class Customer3
{
	private String name; 
	private int id; 

	public Customer3(String name , int id) 
	{
		super();
		this.name=name;
		this.id=id;
	}

	public void setId(int id)  //setter  
	{
		this.id=id;
	}

	public int getId() //getter
	{
		return this.id;
	}
}

public class HeapAndStackDemo
{
	public static void main(String[] args) 
	{
		int val = 100;

		Customer3 c = new Customer3("Ravi",2);   // c = 1000x

        m1(c);   
		
		//GC [Only 1 object is eligible for GC i.e 2000x   because adter execution of m1() the reference of cust will be deleted so it will be eligible for gc] 
		System.out.println(c.getId());  // 5
	
	}

	public static void m1(Customer3 cust) 
	{
		cust.setId(5);
		System.out.println(cust.getId());  //5    
	    cust = new Customer3("Rahul",7);   // cust = 2000x

		cust.setId(9);
		System.out.println(cust.getId());  //9
	}
} 