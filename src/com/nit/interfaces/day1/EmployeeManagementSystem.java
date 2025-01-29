package com.nit.interfaces.day1;
import java.util.Scanner;

//Employee Interface
interface Employee {
 public double calculateSalary();
 public void generatePayroll();
}

//FullTimeEmployee Class
class FullTimeEmployee implements Employee {
 private int employeeId;
 private String employeeName;
 private double monthlySalary;
 private double benefits;

 // Constructor
 public FullTimeEmployee(int employeeId, String employeeName, double monthlySalary, double benefits) {
     if (monthlySalary < 0) {
         throw new IllegalArgumentException("Error: Monthly salary cannot be negative.");
     }
     if (employeeName.trim().isEmpty()) {
         throw new IllegalArgumentException("Error: Employee name cannot be empty.");
     }
     this.employeeId = employeeId;
     this.employeeName = employeeName;
     this.monthlySalary = monthlySalary;
     this.benefits = benefits;
 }

 // Implementing calculateSalary() method
 @Override
 public double calculateSalary() {
     return monthlySalary + benefits;
 }

 // Implementing generatePayroll() method
 @Override
 public void generatePayroll() {
     System.out.println("Employee ID: " + employeeId);
     System.out.println("Employee Name: " + employeeName);
     System.out.println("Monthly Salary: $" + monthlySalary);
     System.out.println("Benefits: $" + benefits);
     System.out.println("Total Salary: $" + calculateSalary());
 }
}

//Main class
public class EmployeeManagementSystem {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     try {
         // User Input
         System.out.print("Enter Employee ID: ");
         int id = scanner.nextInt();
         scanner.nextLine(); // Consume newline
         
         System.out.print("Enter Employee Name: ");
         String name = scanner.nextLine();
         
         System.out.print("Enter Monthly Salary: ");
         double salary = scanner.nextDouble();
         
         System.out.print("Enter Benefits: ");
         double benefits = scanner.nextDouble();
         
         // Creating FullTimeEmployee instance
         FullTimeEmployee emp = new FullTimeEmployee(id, name, salary, benefits);
         
         // Calling methods
         emp.generatePayroll();
     } catch (IllegalArgumentException e) {
         System.out.println(e.getMessage());
     } finally {
         scanner.close();
     }
 }
}
