package com.nit.map.day2;

import java.util.HashMap;
import java.util.Scanner;

public class StudentGradeBookAppl
{	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		HashMap<String,String> gradeBook=new HashMap<>();
//		gradeBook.put("Mike", "A");
//		gradeBook.put("Jane", "B");
//		gradeBook.put("Sung", "S");
//		
		
		while(true)
		{
			System.out.println();
			if(gradeBook.isEmpty())
			{
				System.out.println("There are no Studenda and grades to display...");			
			}
			else {
				System.out.println("=-=-=- Student Grade Book -=-=-=-");
				gradeBook.forEach((k,v) -> System.out.println("\t"+k+"\t"+v));
			}
			
			System.out.println("====Choose one of the Below====");
			System.out.println("\t1. Add Student Grade "+
							 "\n\t2. Remove Student Grade"+
							"\n\t3. Exit");
			
			System.out.println("Enter your Choice : ");
			int choice=Integer.parseInt(sc.nextLine());
			
			switch(choice)
			{
				case 1:
					System.out.println("===Adding Student===");
					System.out.println("Enter Student Name ");
					String name=sc.nextLine();
					System.out.println("Enter Student Grade ");
					String grade=sc.nextLine();
					gradeBook.put(name, grade);
					System.out.println("Your Grade has been added successfully..");
					break;
					
				case 2:
					if(gradeBook.isEmpty())
					{
						System.out.println("There is no record");
					}
					else {
						System.out.println("Enter Student name whose grade you want to remove :" );
						String sname=sc.nextLine();
						if(gradeBook.containsKey(sname))
						{
							gradeBook.remove(sname);
							System.out.println(sname+" successfully removed..");
						}
						else {
							System.err.println("Student not found...");
						}
					}
					break;
					
				case 3:
					System.out.println("Keep Visiting our application");
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Choice, Please select from below options...");
			}

		}
	}
	
}
