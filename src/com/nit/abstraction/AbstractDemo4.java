package com.nit.abstraction;

abstract class Animal
{
	public abstract void checkup();
}

class Lion extends Animal
{
	protected String name;
	
	public Lion(String name) 
	{
		super();
		this.name = name;
	}

	@Override
	public void checkup() 
	{
		System.out.println(name+ " Lion is going for Checkup");		
	}
	
}
class Elephant extends Animal
{
protected String name;
	
	public Elephant(String name) 
	{
		super();
		this.name = name;
	}

	@Override
	public void checkup() 
	{
		System.out.println(name+ " Elephant is going for Checkup");		
	}
}

class Horse extends Animal
{
protected String name;
	
	public Horse(String name) 
	{
		super();
		this.name = name;
	}

	@Override
	public void checkup() 
	{
		System.out.println(name+ " Horse is going for Checkup");		
	}
}

public class AbstractDemo4 {

	public static void main(String[] args) 
	{		
        Lion lions[] = {new Lion("Simba"),new Lion("myLion")};	
        
        Elephant elephants[] = {new Elephant("Erawat"), new Elephant("jambo")};
        
        Horse horses[] = {new Horse("Chetak"), new Horse("MyHorse")};
		
        visitZooForCheckup(lions);
        System.out.println("..................");
        visitZooForCheckup(elephants);
        System.out.println("..................");
        visitZooForCheckup(horses);
	}
	
	public static void visitZooForCheckup(Animal ...animals)
	{
		for(Animal animal : animals)
		{
			animal.checkup();
		}
	}

}

/* Simba Lion is going for Checkup
myLion Lion is going for Checkup
..................
Erawat Elephant is going for Checkup
jambo Elephant is going for Checkup
..................
Chetak Horse is going for Checkup
MyHorse Horse is going for Checkup
 */
