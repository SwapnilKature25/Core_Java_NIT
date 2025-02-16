package com.nit.innerclass;

class University 
{
    private String name;

    public University(String name)
	{
        this.name = name;
    }
    
    public void displayUniversityName()
	{
        System.out.println("University Name: " + name);
    }

    public class Department 
	{
        private String name;
        private String headOfDepartment;

        public Department(String name, String headOfDepartment) 
		{
            this.name = name;
            this.headOfDepartment = headOfDepartment;
        }

        // Method to display department details
        public void displayDepartmentDetails()
		{
//        	Since the Department class is an inner class, it has direct access to the outer class’s method.
			displayUniversityName(); 
            System.out.println("Department Name: " + name);
            System.out.println("Head of Department: " + headOfDepartment);
            
        }
    }
}
public class Test8
{
    public static void main(String[] args) 
	{
       
        University university = new University("JNTU");

       University.Department cs = university.new Department("Computer Science", "Dr. John");

        University.Department ee = university.new Department("Electrical Engineering", "Dr. Scott");

       
        cs.displayDepartmentDetails();
        ee.displayDepartmentDetails();
    }
}
