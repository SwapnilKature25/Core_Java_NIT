package com.nit.map;

import java.util.*;
import java.io.*;

public class PropertiesDemo1 
{
	public static void main(String[] args) throws IOException
	{
	 FileReader reader = new FileReader("C:\\Properties_Java\\db.properties");
		
		 Properties p = new Properties();		 
		 p.load(reader);
		 
		 String driver = p.getProperty("driver");
		 String userName = p.getProperty("userName");
		 String password = p.getProperty("password");
		 
		 System.out.println(driver); 
		 System.out.println(userName);
		 System.out.println(password);
		   
	   
/*
oracle.jdbc.driver.OracleDriver
swapnil
tiger  */

	}

}