package com.nit.multithreading.practice.test1;

/* You are tasked with creating an education institute course enrollment system
 *  using Java. The system should provide courses and offers to students, 
 *  allowing them to view available courses, ongoing offers, and 
 *  enroll in their preferred courses.*/

public class Course {
	private int cid;
	private String cname;
	private double cfee;
	public Course(int cid, String cname, double cfee) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cfee = cfee;
	}
	public int getCid() {
		return cid;
	}
	public String getCname() {
		return cname;
	}
	public double getCfee() {
		return cfee;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", cfee=" + cfee + "]";
	}
	
}
