package com.nit.stream_api_practice;

import java.util.Scanner;
import java.util.function.Function;

class Student
{
	private Integer studentId;
	private String studentName;
	
	public Student(Integer studentId, String studentName) 
	{
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public String toString() 
	{
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}	
}

public class ConstructorReferenceDemo4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Function<Integer,Student[]> fn=Student[]::new;		
		System.out.println("Enter the size of the array ");
		int n=sc.nextInt();
		Student[] std = fn.apply(n);
		
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter student id : ");
			int id=sc.nextInt();
			System.out.println("Enter student Name : ");
			String name=sc.next();
			std[i]=new Student(id,name);
			
		}
		
//		System.out.println(Arrays.toString(std));
		
		System.out.println("Fetching the data from Array Object :");
		 for(Student s : std)
		 {
			 System.out.println(s);
		 }
		 
		
	}
}
	