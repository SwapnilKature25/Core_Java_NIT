package com.nit.jvm_architecture;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

class Tester
{
   int x = 100;
   static Scanner sc = new Scanner(System.in);
   static int y = 200;
   int z = 300;
   
   public void input() {}
   
   public static void accept() {}
      
   public void display() {}   
   
   public void show() {}
   
   public void m1() {}
   
}

public class ClassInformationDemo 
{
	public static void main(String[] args) throws ClassNotFoundException
	{
      Class cls =  Class.forName("com.nit.jvm_architecture.Tester");
      
      System.out.println("Class Name is :"+cls.getName());
      System.out.println("Package Name is :"+cls.getPackageName());
      
      Method[] methods = cls.getDeclaredMethods();
      System.out.println("Method names are :");
      int count = 0;
      for(Method method : methods)
      {
    	  System.out.println(method.getName());
    	  count++;
      }
      
      System.out.println("Total number of Methods are :"+count);
      
      count = 0;
      Field[] fields = cls.getDeclaredFields();
      
      System.out.println("Available fields are :");
      
      for(Field field : fields)
      {
    	  System.out.println(field.getName());
    	  count++;
      }
      System.out.println("Total number of fields are :"+count);
	}
}