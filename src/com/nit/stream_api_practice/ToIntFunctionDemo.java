package com.nit.stream_api_practice;

import java.util.ArrayList;
import java.util.function.ToIntFunction;

record Employee3(String name, Integer experience)
{
	
}

public class ToIntFunctionDemo 
{
   public static void main(String[] args) 
   {
	  ArrayList<Employee3> listOfEmployee = new ArrayList<>();
	  listOfEmployee.add(new Employee3("Virat",12));
	  listOfEmployee.add(new Employee3("Rohit",12));
	  listOfEmployee.add(new Employee3("Bumrah",6));
	  listOfEmployee.add(new Employee3("Akshar",5));
	  listOfEmployee.add(new Employee3("Abhishek",4));
	  
	 
                                        
      ToIntFunction<Employee3> playerExp = employee -> employee.experience();

      int totalYearsOfExperience = listOfEmployee.stream()    		  					
                                              .mapToInt(playerExp)
                                              .sum();
        
       System.out.println("Total years of experience: " + totalYearsOfExperience);
   
       
      
   }
}
