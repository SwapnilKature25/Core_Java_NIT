package com.nit.multithreading.assignments.mcq3;

public class NewPlatForm4 implements Runnable {
    public void run() 
    { 
    	System.out.printf("%d", 3); 
    }
    public static void main(String[] args)
        throws InterruptedException
    {
        Thread thread = new Thread(new NewPlatForm4());
        thread.start();
        System.out.printf("%d", 1);
        thread.join();
        System.out.printf("%d", 2);
    }
}
// 132

