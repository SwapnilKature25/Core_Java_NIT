package com.nit.stream_api.day1;
/* WAP to print all the names from String array where the length of the 
    name must be greater than 3.

    String[] words = {"Raj", "Rohit", "Smirti", "Richa", "Sky"};
    Output : [Rohit, Smirti, Richa] */
import java.util.*;
public class NITTest1 {
	public static void main(String[] args) 
	{
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter no of names to add ");
         int n=Integer.parseInt(sc.nextLine());
         String words[]=new String[n];  
         for(int i=0; i<n; i++)
         {
             words[i]=sc.nextLine();
         }
         Arrays.stream(words).filter(str -> str.length() > 3).forEach(System.out::println);

    }
}