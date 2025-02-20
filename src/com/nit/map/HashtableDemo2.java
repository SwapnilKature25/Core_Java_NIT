package com.nit.map;
import java.util.*;  
public class HashtableDemo2
{  
   public static void main(String args[])
	{  
    Hashtable<Integer,String> map=new Hashtable<>();          
     map.put(1,"Priyanka");    
     map.put(2,"Ruby");   
     map.put(3,"Vibha");    
     map.put(4,"Kanchan");
     System.out.println("Original Map: "+map); 
	
	 map.putIfAbsent(5,"Bina");  
	 map.putIfAbsent(24,"Pooja");
	 map.putIfAbsent(26,"Ankita");     
    
     map.putIfAbsent(1,"Sneha");  
     System.out.println("Updated Map: "+map);  // Updated Map: {5=Bina, 26=Ankita, 4=Kanchan, 3=Vibha, 24=Pooja, 2=Ruby, 1=Priyanka}

 }  
}  