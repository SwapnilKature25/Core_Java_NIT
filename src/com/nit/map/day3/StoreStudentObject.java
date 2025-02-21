package com.nit.map.day3;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class StoreStudentObject {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		ArrayList<Student> st=new ArrayList<>();
		Student std=new Student();
		var fos=new FileOutputStream("C:\\Users\\swapn\\SerializationDeserial\\student.txt");
		var oos = new ObjectOutputStream(fos);
		
		try(fos; oos)
		{
			System.out.println("How many Student you want to Store : ");
			int n=sc.nextInt();
			
			for(int i=0; i<n; i++)
			{
				st.add(std.getStudentObject());
			}
			oos.writeObject(st);
			
			System.out.println("Student Data stored Successfully!!!");						
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
}

/* 
 How many Student you want to Store : 
1
Enter Student Id :
675
Enter Student Name :
Swap
Enter Student Fees :
4544554
Enter Student Date Of Admission :
1-1-2003
Student Data stored Successfully!!!*/
