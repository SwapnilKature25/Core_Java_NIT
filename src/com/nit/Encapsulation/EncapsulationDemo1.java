package com.nit.Encapsulation;
 
class Student 
{
	private int studentId;  
	private String studentName; 
	private int studentMarks;
	private String studentAddress;

	public Student(int studentId, String studentName, int studentMarks, String studentAddress) 
	{
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
		this.studentAddress = studentAddress;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentMarks=" + studentMarks
				+ ", studentAddress=" + studentAddress + "]";
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(int studentMarks) {
		this.studentMarks = studentMarks;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) 
	{
		this.studentAddress = studentAddress;
	}
}

 

public class EncapsulationDemo1 {

	public static void main(String[] args) 
	{
		Student raj = new Student(111, "Raj", 90, "Ameerpet");
		System.out.println(raj);
		//Address Updated
		raj.setStudentAddress("S R Nagar");
		System.out.println(raj);
		
		int marks = raj.getStudentMarks();
		
		if(marks >= 90)
		{
			System.out.println(raj.getStudentName()+" is Excellent in Subject");
		}
		else if(marks >=75)
		{
			System.out.println(raj.getStudentName()+" is Very good in Subject");
		}
		else
		{
			System.out.println(raj.getStudentName()+" is good in Subject");
		}
		
		

	}

}

/* Student [studentId=111, studentName=Raj, studentMarks=90, studentAddress=Ameerpet]
Student [studentId=111, studentName=Raj, studentMarks=90, studentAddress=S R Nagar]
Raj is Excellent in Subject
 */