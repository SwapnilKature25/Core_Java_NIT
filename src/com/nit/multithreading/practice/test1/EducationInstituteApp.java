package com.nit.multithreading.practice.test1;

public class EducationInstituteApp {
	public static void main(String[] args) throws InterruptedException {
		Offer[] offers= {new Offer("Limited time offer !! 10% Discount "),
						 new Offer("Enroll in any two courses and get one Free")};
		
		Course[] courses= { new  Course(1,"Java",30000),
							new Course(2,"Python",20000),
							new Course(3,"Data S",15000)};
		
		EducationInstitute institute=new EducationInstitute(courses, offers);
		
		Student s1=new Student("virat",institute);
		s1.viewCourseAndFees();
		s1.viewOffers();
		s1.enrollInCourse(1);
		
		Student s2=new Student("Rohit",institute);
		s2.viewCourseAndFees();
		s2.viewOffers();
		s2.enrollInCourse(2);
		
		s1.start();
		s1.join();
		s2.start();
		
	}
}
