package com.nit.sundayTopics;

//static nested inner class
class BigOuter
{
   static class Nest   //static nested inner class   
   {
        void go()  //Non static method of nested inner class
        {
             System.out.println("Hello welcome to static nested class");  
        }   
   } 
}
class StaticInnerClass1
{    
    public static void main(String args[])
    {
        BigOuter.Nest n = new BigOuter.Nest();  //  if the member of inner class is not static
        n.go();			
//    	BigOuter.Nest.go();   // if the member of inner class is static
    } 
}