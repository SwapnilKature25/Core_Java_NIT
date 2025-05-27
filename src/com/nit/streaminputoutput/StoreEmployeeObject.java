package com.nit.streaminputoutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Employee implements Serializable
{
	private Integer employeeId;
	private String employeeName;
	private Double employeeSalary;

	public Employee(Integer employeeId, String employeeName, Double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
	
	public static Employee getEmployeeObject()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee Id :");
		int id = sc.nextInt();
		System.out.print("Enter Employee Name :");
		String name = sc.nextLine();
		name = sc.nextLine();
		System.out.print("Enter Employee Salary :");
		double sal = sc.nextDouble();
		
		return new Employee(id, name, sal);
		
	}
}


public class StoreEmployeeObject {

	public static void main(String[] args) throws IOException 
	{
		var fout = new FileOutputStream("C:\\Users\\swapn\\SerializationDeserial\\storeEmpObj.txt");
		var oos = new ObjectOutputStream(fout);
		var scanner = new Scanner(System.in);
		
		
		try(oos; fout; scanner)
		{
			System.out.println("How many objects you want to write :");
			int noOfObj = scanner.nextInt();
			
			for(int i=1; i<=noOfObj; i++)
			{
				Employee employee = Employee.getEmployeeObject();
				oos.writeObject(employee);
			}
			System.out.println("Object Data stored Successfully!!!!");			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}