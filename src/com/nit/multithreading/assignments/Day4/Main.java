package com.nit.multithreading.assignments.Day4;

public class Main {
	public static void main(String[] args) {
		Course [] courses = {new Course(1,"MAthematics",1000),new Course(2,"Scinece",1200),new Course(3,"English",900)};
		
		Offer []offers = {new Offer("Special discount: Get 20% off on all courses!"),new Offer("Limited time offer: Enroll in any two courses and get one course free!\r\n"
				+ "")};
		EducationInstitute nit = new EducationInstitute(courses,offers);
		
		Student s1=new Student("Virat",nit);
		s1.viewCoursesAndFees();
		s1.viewOffers();
		s1.enrollInCourse(2);
		Student s2=new Student("Dhoni",nit);
		s2.viewCoursesAndFees();
		s2.viewOffers();
		s2.enrollInCourse(3);
		
		s1.start();
		s2.start();
		
	}
}
