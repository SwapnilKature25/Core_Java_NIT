package com.nit.collection.generics;

//Program that describes the return type of any method can be type safe 
//[We can apply generics on method return type]


import java.util.ArrayList;
import java.util.List;

record Dog(String name)
{
	
}

public class GenericTest5 {

	public static void main(String[] args) 
	{
		 Dog dog = getListOfDogObject().get(1); 
		 System.out.println(dog.name()); // B
	}
	
	public static List<Dog> getListOfDogObject()
	{
		List<Dog> listOfDogs = new ArrayList<>();
		listOfDogs.add(new Dog("A"));
		listOfDogs.add(new Dog("B")); 
		listOfDogs.add(new Dog("C"));
				
		return listOfDogs;
		
	}
}

//Note :- In the above program the compiler will stop us from returning anything which
//is not compaitable List<Dog> and there is a guarantee that only "type safe list of Dog 
//object" will be returned so we need not to provide type casting as shown below
//Dog d2 = (Dog) d1.getDogList().get(0);  //before generic.