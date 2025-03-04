package com.nit.stream_api.assignments.day6;

public class Student {
	private String name;
	private String gender;
	private String department;
	private double gpa;
	private int yearsOfStudy;
	public Student(String name, String gender, String department, double gpa, int yearsOfStudy) {
		super();
		this.name = name;
		this.gender = gender;
		this.department = department;
		this.gpa = gpa;
		this.yearsOfStudy = yearsOfStudy;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public int getYearsOfStudy() {
		return yearsOfStudy;
	}
	public void setYearsOfStudy(int yearsOfStudy) {
		this.yearsOfStudy = yearsOfStudy;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", department=" + department + ", gpa=" + gpa
				+ ", yearsOfStudy=" + yearsOfStudy + "]";
	}
	
	
}
