package com.nit.collection.generics;

//Polymorphism with array
//Polymorphism with array

import java.util.*;
abstract class Animal
{
	public abstract void checkup();
}

class Dog1 extends Animal
{
	@Override
	public void checkup()
	{
		System.out.println("Dog checkup");
	}
}

class Cat extends Animal
{
	@Override
	public void checkup()
	{
		System.out.println("Cat checkup");
	}
}

class Bird extends Animal
{
	@Override
	public void checkup()
	{
		System.out.println("Bird checkup");
	}
}

public class  GenericTest9
{
	public static void checkAnimals(Animal ...animals) 
	{
		for(Animal animal : animals)
		{
			animal.checkup();
		}
	}

	public static void main(String[] args) 
	{
		Dog1 []dogs={new Dog1(), new Dog1()};

		Cat []cats={new Cat(), new Cat(), new Cat()};

		Bird []birds = {new Bird(), new Bird()};
	

		checkAnimals(dogs);
		checkAnimals(cats);
		checkAnimals(birds);
	}
}

//Note :-From the above program it is clear that polymorphism(Upcasting) concept 
//works with array.
/*
 Dog checkup
Dog checkup
Cat checkup
Cat checkup
Cat checkup
Bird checkup
Bird checkup

 */
