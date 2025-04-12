package com.nit.Encapsulation;

class Customers
{
	private String name; 
	private int id; 

	public Customers(String name , int id) 
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

	@Override
	public String toString() {
		return "Customers [name=" + name + ", id=" + id + "]";
	}
	
	
}

public class GarbageCollectorDemo
{
	public static void main(String[] args) 
	{
		int val = 100;

		Customers c = new Customers("Ravi",2);

        m1(c);   
		
		//GC [Only 1 object is eligible for GC i.e 3000x] 
		
		System.out.println(c.getId());
	}

	public static void m1(Customers cust) 
	{
		cust.setId(5);
		System.out.println(cust);		

	    cust = new Customers("Rahul",7);
	    System.out.println(cust);		

		cust.setId(9);
		System.out.println(cust.getId());
	}
}  


/* Customers [name=Ravi, id=5]
Customers [name=Rahul, id=7]
9
5
 */