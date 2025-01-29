package com.nit.multithreading.practice.test1;

public class EducationInstitute {
	Course courses[];
	Offer offers[];
	public EducationInstitute(Course[] courses, Offer[] offers) {
		super();
		this.courses = courses;
		this.offers = offers;
	}
	public Course[] getCourses()
	{
		return courses;
	}
	public Offer[] getOffers()
	{
		return offers;
	}
	public void enrollStudentInCourse(int cid, String sname)
	{
		for(Course c : courses)
		{
			if(cid==c.getCid())
			{
				System.out.println(sname+ " has enrolled in course : "+c.getCname());
			}
			System.out.println("Inavlid Course_ID");
		}
	}
	
}
