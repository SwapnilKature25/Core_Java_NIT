package com.nit.Encapsulation;


class Employee 
{                      
	private int employeeId;
	private String employeeName;

	public Employee(int employeeId, String employeeName) 
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}
	
}



class Manager 
{
	private int managerId;
	private String managerName;

	public Manager(Employee emp) // emp = e1
	{
		this.managerId = emp.getEmployeeId();
		this.managerName = emp.getEmployeeName();
	}

	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", managerName=" + managerName + "]";
	}

}


public class CopyConstructor 
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee(111, "Scott");
        Manager m1 = new Manager(e1);
        System.out.println(m1);
	}

}

// Manager [managerId=111, managerName=Scott]

