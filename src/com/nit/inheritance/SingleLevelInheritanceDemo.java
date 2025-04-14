package com.nit.inheritance;

class TemporaryEmployee {
	protected int employeeId;
	protected String employeeName;
	protected String employeeAddress;

	public TemporaryEmployee(int employeeId, String employeeName, String employeeAddress) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
	}

}

class PermanentEmployee extends TemporaryEmployee {
	protected String department;
	protected String designation;

	public PermanentEmployee(int employeeId, String employeeName, String employeeAddress, String department, String designation) 
	{
		super(employeeId, employeeName, employeeAddress);
		this.department = department;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "PermanentEmployee [employeeId=" + super.employeeId + ", employeeName=" + employeeName + ", employeeAddress="
				+ employeeAddress + ", department=" + department + ", designation=" + designation + "]";
	}

	
	
	
}

public class SingleLevelInheritanceDemo 
{
	public static void main(String[] args)
	{
		PermanentEmployee p = new PermanentEmployee(1, "John", "Ameerpet", "IT", "developer");
		System.out.println(p);
	}

}