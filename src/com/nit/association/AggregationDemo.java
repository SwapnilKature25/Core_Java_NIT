package com.nit.association;

 class College 
{
	private String collegeName;
	private String collgeLocation;

	public College(String collegeName, String collgeLocation) 
	{
		super();
		this.collegeName = collegeName;
		this.collgeLocation = collgeLocation;
	}

	@Override
	public String toString() {
		return "College [collegeName=" + collegeName + ", collgeLocation=" + collgeLocation + "]";
	}
	
	
	
	
	

}
 class Students {
	private int studentId;
	private String studentName;
	private College collge; // HAS-A Relation

	public Students(int studentId, String studentName, College collge) 
	{
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.collge = collge;
	}

	@Override
	public String toString() {
		return "Students [studentId=" + studentId + ", studentName=" + studentName + ", collge=" + collge + "]";
	}
	

}

public class AggregationDemo {

	public static void main(String[] args) 
	{
		College c1 = new College("VIT", "Vellore");
			
		
		Students s1 = new Students(1, "Scott", c1);
		
		Students s2 = new Students(2, "Martin", c1);
		Students s3 = new Students(3, "Smith", c1);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}