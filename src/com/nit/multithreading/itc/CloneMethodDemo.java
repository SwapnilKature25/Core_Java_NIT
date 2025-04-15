package com.nit.multithreading.itc;

class Employee implements Cloneable
{
	private Integer employeeId;
	private String employeeName;
	
	public Employee(Integer employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
		
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}	

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	@Override
	public String toString() 
	{
				
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}	
	
}
public class CloneMethodDemo 
{
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Employee e1 = new Employee(111,"Scott");
		
		Employee e2 = (Employee) e1.clone();  //Down-casting
		e2.setEmployeeId(999);
		e2.setEmployeeName("Raj");
		
		System.out.println(e1);
		System.out.println(e2);
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		

	}

}