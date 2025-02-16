package com.nit.innerclass;


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
class Test11StaticInner
{    
    public static void main(String args[])
    {
        BigOuter.Nest n = new BigOuter.Nest();
        n.go();	
//    	BigOuter.Nest.go();   // if method is static inside of static inner class
    } 
}