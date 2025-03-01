package com.nit.stream_api.day7;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

class Person
{
	private Integer pid;
	private String pname;
	public Person(Integer pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + "]";
	}
	
	
	
}

public class ConstructorReferenceDemo4 {
	public static void main(String[] args) {
		
		//Person Array Object i want to create
		
		Function<Integer,Person[]> fn2= Person[]::new;
		
		Person[] persons = fn2.apply(3); // 3 is the size of the array
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<persons.length; i++)
		{
			System.out.println("Enter the Person Id :");
			int id =sc.nextInt();
			System.out.println();
			System.out.println("Enter the Person name :");
			String name =sc.nextLine();
			name=sc.nextLine();
			
			persons[i] = new Person(id,name);
		}
		
		System.out.println(Arrays.toString(persons));
		
		
		/* 
Enter the Person Id :
111
Enter the Person name :
Swap

Enter the Person Id :
112
Enter the Person name :
ALen

Enter the Person Id :
113
Enter the Person name :
Mike
[Person [pid=111, pname=Swap], Person [pid=112, pname=ALen], Person [pid=113, pname=Mike]] */
		
		
	}
}
