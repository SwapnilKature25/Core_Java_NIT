package com.nit.multithreading.practice.test1;

public class Student extends Thread{
	String name;
	EducationInstitute institute;
	public Student(String name, EducationInstitute institute) {
		super();
		this.name = name;
		this.institute = institute;
	}
	public void  viewCourseAndFees()
	{
		Course[] courses = institute.getCourses();
		System.out.println("Available Courses : ");
		
		for(Course c: courses)
		{
			System.out.println(c.getCid()+". "+ c.getCname()+" - Fee : Rs."+c.getCfee());
		}
	}
	public void viewOffers()
	{
		Offer[] offers = institute.getOffers();
		System.out.println("Available Offers : ");
		
		for(Offer o: offers)
		{
			System.err.println(o.getOfferText());
		}
	}
	public void enrollInCourse(int cid)
	{
		institute.enrollStudentInCourse(cid, name);
	}
}
