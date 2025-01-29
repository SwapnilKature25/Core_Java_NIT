package com.nit.multithreading.practice.test4;

/* Objective:
Design a COVID-19 vaccine booking application that allows users to check their
 eligibility based on age and health conditions. Users who meet the eligibility 
 criteria can book a dose, and the application should handle concurrent user 
 interactions using threads.
 */

public class CoronaVaccineApp {
	public static void main(String[] args) {
		User u1=new User("Ramesh",21,true);
		User u2=new User("Suresh",11,false);
		
		Thread t1=new Thread( ()->
		{
			try {
				u1.bookDose();
			}
			catch(RuntimeException e)
			{
				System.out.println(e.getMessage());
			}
		});
		
		Thread t2=new Thread( ()-> 
		{
			try {
				u2.bookDose();
			}
			catch(RuntimeException e1)
			{
				System.out.println(e1.getMessage());
			}
		});
		
		t1.start();
		t2.start();
	}
	
	
}
