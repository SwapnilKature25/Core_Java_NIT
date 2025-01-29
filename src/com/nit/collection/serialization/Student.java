package com.nit.collection.serialization;

import java.io.Serializable;
import java.util.Date;
import java.util.Scanner;

public class Student implements Serializable{
	private int studentId;
	private String studentName;
	private double studentFees;
	private Date dateOfAdmission;
	
	public Student(Integer studentId, String studentName, Double studentFees, Date dateOfAdmission) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFees = studentFees;
		this.dateOfAdmission = dateOfAdmission;
	}

	public static Student getStudentObject() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Id : ");
		int stdId=sc.nextInt();
		System.out.println("Enter Student Name : ");
		String  stdName=sc.nextLine();
		stdName=sc.nextLine();
		System.out.println("Enter Student Fees : ");
		double  stdFees=sc.nextDouble();
		Date dateOfAdmission=new Date();
		Student s1=new Student(stdId,stdName,stdFees,dateOfAdmission);
		return s1;		
	}
	
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFees=" + studentFees
				+ ", dateOfAdmission=" + dateOfAdmission + "]";
	}

}
