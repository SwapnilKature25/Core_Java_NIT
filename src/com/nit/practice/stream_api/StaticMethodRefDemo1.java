package com.nit.practice.stream_api;

//Program on static Method Reference :


import java.util.Vector;

class EvenOrOdd   
{
	public static void isEven(int number) 
  {
      if (number % 2 == 0)
      {
          System.out.println(number + " is even");
      } 
      else 
      {
          System.out.println(number + " is odd");
      }
  }
}
public class StaticMethodRefDemo1 
{
	public static void main(String[] args) 
     {
     Vector<Integer> numbers = new Vector<>();          
     numbers.add(5);
     numbers.add(2);
     numbers.add(9);
     numbers.add(12);       
     
     //By using Lambda Expression
	   numbers.forEach(num -> EvenOrOdd.isEven(num));
	   
	   System.out.println("...............");
	   
	   //By using Method Reference
	   numbers.forEach(EvenOrOdd::isEven);
	   
  }
}