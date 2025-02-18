package com.nit.map.day2;

import java.util.HashMap;
import java.util.Scanner;

public class AddressBookAppl {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
//		Contact c1=new Contact("Mike", 98786789);
//		Contact c2=new Contact("Jane", 88786789);
		
		HashMap<String,Contact> addBook=new HashMap<>();
//		addBook.put(111, c1);
//		addBook.put(112, c2);
		
		while(true)
		{
			if(addBook.isEmpty())
			{
				System.out.println("The Address book is empty...");
			}
			else {
				System.out.println("======Address Book Details=====");
				addBook.forEach((k,v) -> System.out.println("\t"+k+"\t"+v.getPhno()));
			}
			
			System.out.println("====Choose one of the Below====");
			System.out.println("\t1. Add Contact"+
							 "\n\t2. Remove Contact"+
							"\n\t3. Exit");
			
			System.out.println("Enter your Choice : ");
			int choice=Integer.parseInt(sc.nextLine());
			
			switch(choice)
			{
				case 1:
					System.out.println("====Adding to Address Book====");
					System.out.println("Enter the Name :");
					String name=sc.nextLine();
					System.out.println("Enter the Phone No :");
					long pno=Long.parseLong(sc.nextLine());
					addBook.put(name, new Contact(name,pno));
					System.out.println("Contact added successfully...");
					System.out.println();
					break;
					
				case 2:
					if(addBook.isEmpty())
					{
						System.out.println("The Address book is empty...");
					}
					else {
						System.out.println("Enter the Contact Name :");
						String cname=sc.nextLine();
						
						if(addBook.containsKey(cname))
						{
							addBook.remove(cname);
							System.out.println("Contact deleted from Address Book Successfully..");
						}
						else {
							System.err.println("Contact not Found..");
						}
					}
					System.out.println();
					break;
				case 3:
					System.out.println("Keep Visiting our application");
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Choice, Please select from below options...");
			}
		}
		
		
	}
}
