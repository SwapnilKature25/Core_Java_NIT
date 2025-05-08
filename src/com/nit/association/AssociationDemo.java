package com.nit.association;

import java.util.Scanner;

class Student 
{
	private int studentId;
	private String studentName;
	private int studentMarks;

	public Student(int studentId, String studentName, int studentMarks)
	{
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(int studentMarks) {
		this.studentMarks = studentMarks;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentMarks=" + studentMarks
				+ "]";
	}

}

class Trainer 
{
	public static void viewStudentProfile(Student obj)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student id :");
		int id = sc.nextInt();		
         
		if(id == obj.getStudentId())
		{
			System.out.println(obj);
		}
		else
		{
			System.err.println("Sorry! No such student with given id");
		}
		sc.close();
		
	}
	
}



public class AssociationDemo {

	public static void main(String[] args)
	{
		Student raj = new Student(1, "Raj", 88);
		Trainer.viewStudentProfile(raj);

	}

}