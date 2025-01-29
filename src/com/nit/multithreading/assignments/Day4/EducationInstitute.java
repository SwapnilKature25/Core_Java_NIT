package com.nit.multithreading.assignments.Day4;

public class EducationInstitute {
	Course[] courses;
	Offer[] offers;
	public EducationInstitute(Course[] courses, Offer[] offers) {
		super();
		this.courses = courses;
		this.offers = offers;
	}
	public Course[] getCourses() {
		return courses;
	}
	public Offer[] getOffers() {
		return offers;
	}
	
	public void enrollStudentInCourse(int courseId, String studentName)
	{
		for(Course c : courses)
		{
			if(courseId == c.getCourseId())
			{
				System.out.println(studentName+" has enrolled in course:"+c.getCourseName());
			}
	        System.out.println("Invalid course ID!");
		}
	}
	
	
}
