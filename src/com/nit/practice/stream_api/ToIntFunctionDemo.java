package com.nit.practice.stream_api;

import java.util.ArrayList;
import java.util.function.ToIntFunction;

record Employee4(String name, Integer experience)
{
	
}

public class ToIntFunctionDemo 
{
   public static void main(String[] args) 
   {
	  ArrayList<Employee4> listOfEmployee = new ArrayList<>();
	  listOfEmployee.add(new Employee4("Virat",12));
	  listOfEmployee.add(new Employee4("Rohit",12));
	  listOfEmployee.add(new Employee4("Bumrah",6));
	  listOfEmployee.add(new Employee4("Akshar",5));
	  listOfEmployee.add(new Employee4("Abhishek",4));
	  
	 
                                        
      ToIntFunction<Employee4> playerExp = employee -> employee.experience();

      int totalYearsOfExperience = listOfEmployee.stream()
                                              .mapToInt(playerExp)
                                              .sum();

        
       System.out.println("Total years of experience: " + totalYearsOfExperience);
   
       
      
   }
}