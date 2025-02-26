package com.nit.stream_api.day1_2_3;

import java.util.Arrays;
import java.util.Scanner;

//WAP to print all the unique numbers from the Array.

//Integer[] numbers = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 4};
//Output : Unique Numbers: [1, 2, 3, 4, 5, 6, 7, 8]

public class NITTest2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers to add ");
        int n=Integer.parseInt(sc.nextLine());
        Integer[]  numbers=new Integer[n];  
        for(int i=0; i<n; i++)
        {
        	numbers[i]=sc.nextInt();
        }
        
        Object[] array = Arrays.stream(numbers).distinct().toArray();
        System.out.println("Unique Numbers: "+Arrays.toString(array));
	}
}

