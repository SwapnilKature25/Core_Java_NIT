package com.nit.collection.generics.day1;

class Fruit    
{
}
class Apple extends Fruit   
{
	@Override
	public String toString()
	{
		return "Apple";
	}
}

class Basket<E>      
{
	private E element;  	
	public void setElement(E element) 
	{
		this.element = element;
	}	

	public E getElement() 
	{
		return this.element;		
	}
}

public class GenericMCQ18
{
	public static void main(String[] args) 
	{
		Basket<Fruit> b = new Basket<>();
		b.setElement(new Apple());

		Apple x = b.getElement();	
//		Apple x =  (Apple) b.getElement();	
		System.out.println(x);
      		
	}
}
