package com.nit.collection.generics;

import java.util.*;
abstract class Animal1
{
	public abstract void checkup();
}

class Dog2 extends Animal1
{
    @Override
	public void checkup()
	{
		System.out.println("Dog checkup");
	}
}

class Cat2 extends Animal1
{
	@Override
	public void checkup()
	{
		System.out.println("Cat checkup");
	}
}
class Bird2 extends Animal1
{
	@Override
	public void checkup()
	{
		System.out.println("Bird checkup");
	}
}
public class GenericTest10
{
	
	public void checkAnimals(List<Animal1> animals)  
	{
		for(Animal1 animal : animals)
		{
             animal.checkup();
		}
	}
	public static void main(String[] args) 
	{
		List<Dog2> dogs = new ArrayList<>();
		dogs.add(new Dog2());   
		dogs.add(new Dog2());

		List<Cat2> cats = new ArrayList<>();
		cats.add(new Cat2());
		cats.add(new Cat2());

		List<Bird2> birds = new ArrayList<>();
		birds.add(new Bird2());
		birds.add(new Bird2());
		
//		GenericTest10 t = new GenericTest10();
//		t.checkAnimals(dogs);
//		t.checkAnimals(cats);
//		t.checkAnimals(birds);

	}
}
/* The method checkAnimals(List<Animal1>) in the type GenericTest10 is not applicable for the arguments (List<Dog2>)
	 */
