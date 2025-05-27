package com.nit.sundayTopics;

// valueOf() used to convert the given String into corrosponding enum object, if enum object is not available throw IllegalArgumentException.
import java.util.Scanner;

enum Color
{
	RED, BLUE, PINK
}

public class EnumDemo8 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Color Name :");
		String colorName = sc.next();
		
		Color color = Color.valueOf(colorName);
        System.out.println(color);	
         sc.close();
	}

}
