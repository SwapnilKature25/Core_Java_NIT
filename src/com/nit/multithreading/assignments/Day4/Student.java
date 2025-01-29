package com.nit.multithreading.assignments.Day4;

public class Student extends Thread {
	String name;
	EducationInstitute institute;
	public Student(String name, EducationInstitute institute) {
		super();
		this.name = name;
		this.institute = institute;
	}
	
	public void viewCoursesAndFees()
	{
		Course[] courses = institute.getCourses();
		
		System.out.println("Available Courses : ");
		
		for(Course c :courses)
		{
			System.out.println(c.getCourseId()+". "+c.getCourseName()+" - Fee: Rs."+c.getCourseFee());
		}
		
	}
	
	public void viewOffers()
	{
		System.out.println("Ongoing Offers");
		
		Offer[] offers = institute.getOffers();
		
		for(Offer o :offers)
		{
			System.out.println(o.getOfferText());
		}
	}
	
	public void enrollInCourse(int courseId)
	{
		institute.enrollStudentInCourse(courseId, name);
	}
}
