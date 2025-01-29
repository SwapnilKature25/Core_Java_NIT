package com.nit.multithreading.assignments.Day4;

/* You are tasked with creating an education institute course enrollment system
 *  using Java. The system should provide courses and offers to students, 
 *  allowing them to view available courses, ongoing offers, and 
 *  enroll in their preferred courses.*/


public class Course {
	private int courseId;
	private String courseName;
	private double courseFee;
	public Course(int courseId, String courseName, double courseFee) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseFee = courseFee;
	}
	public int getCourseId() {
		return courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public double getCourseFee() {
		return courseFee;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseFee=" + courseFee + "]";
	}
	
	
}
