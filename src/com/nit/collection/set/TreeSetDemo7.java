package com.nit.collection.set;
//
//Sorting the Student Data based on the different Criteria :

import java.util.TreeSet;

record Student(Integer id, Double fees)
{
	
}

public class TreeSetDemo7 
{
	public static void main(String[] args) 
	{
	   TreeSet<Student> ts1 = new TreeSet<>((s1,s2) -> Integer.compare(s1.id(), s2.id()));	
       ts1.add(new Student(333, 25000D));
       ts1.add(new Student(222, 2200D));
       ts1.add(new Student(111, 20000D));
       
       System.out.println("Sorting student Data based on the ID :");
       
       for(Student st : ts1)
       {
    	   System.out.println(st);
       }
       
       
       TreeSet<Student> ts2 = new TreeSet<>((s1,s2) -> Double.compare(s1.fees(), s2.fees()));	
       ts2.add(new Student(333, 25000D));
       ts2.add(new Student(222, 2200D));
       ts2.add(new Student(111, 20000D));
       
       System.out.println("Sorting student Data based on the Fees :");
       
       for(Student st : ts2)
       {
    	   System.out.println(st);
       }      
       
     }
}

/* Sorting student Data based on the ID :
Student[id=111, fees=20000.0]
Student[id=222, fees=2200.0]
Student[id=333, fees=25000.0]
Sorting student Data based on the Fees :
Student[id=222, fees=2200.0]
Student[id=111, fees=20000.0]
Student[id=333, fees=25000.0]*/