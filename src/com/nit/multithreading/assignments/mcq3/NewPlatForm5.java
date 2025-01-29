package com.nit.multithreading.assignments.mcq3;



class CheckingMyDaemonThread extends Thread {
	
public void run()
    {
       if (Thread.currentThread().isDaemon()) {
          System.out.println("I am daemon thread and I am working");
        }
   else {
          System.out.println("I am user thread and I am working");
        }
    }
}
class NewPlatForm5 {
  public static void main(String[] args)
    {
        CheckingMyDaemonThread t1= new CheckingMyDaemonThread();
        CheckingMyDaemonThread t2= new CheckingMyDaemonThread();
        CheckingMyDaemonThread t3= new CheckingMyDaemonThread();
        t1.start();
        t2.start();
        t3.start();
        t2.setDaemon(true);	// This method must be invoked before the thread is started. The behaviorof this method when the thread has terminated is not specified.
    }
}