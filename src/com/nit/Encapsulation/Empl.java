package com.nit.Encapsulation;

public class Empl
{
	int id = 100;
	
	public static void main(String[] args) 
	{
		int val = 200;

		Empl e1 = new Empl();    // 1000x   id=200

		e1.id = val;    

		update(e1);	  
		
		System.out.println(e1.id);  // 500

        Empl e2 = new Empl();   // 3000x  id=900

		e2.id = 900;
        
		switchEmployees(e2,e1); //3000x, 1000x

		  //GC [2 objects, 2000x and 4000x both are eligible]

			System.out.println(e1.id);  // 500
		    System.out.println(e2.id);  // 500
	  } 
		
	 public static void update(Empl e)   
	 {
        e.id = 500;      // 1000x  id =500
		e = new Empl();  // 2000x id=400
		e.id = 400;
		System.out.println(e.id);  // 400
	 }

	 public static void switchEmployees(Empl e1, Empl e2)  // 3000x, 1000x
	  {
		 int temp = e1.id;     // t = 900   // 3000x
		 e1.id = e2.id;      // e1.id= 500   // 1000x
		 e2 = new Empl();  // 4000x id=900
		 e2.id = temp;
	  }
   }
