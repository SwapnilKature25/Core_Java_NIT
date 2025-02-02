package com.nit.multithreading.assignments.day5;

class ThreadAA extends Thread {
    public void run() {
        try {
            System.out.println("ThreadA is running and will sleep for 2 seconds.");
            Thread.sleep(2000);
            System.out.println("ThreadA has finished execution.");
        } catch (InterruptedException e) {
            System.out.println("ThreadA was interrupted.");
        }
    }
}

class ThreadBB extends Thread {
    private Thread threadA;
    
    public ThreadBB(Thread threadAA) {
        this.threadA = threadAA;
    }
    
    public void run() {
        try {
            System.out.println("ThreadB is running and waiting for ThreadA to complete.");
            threadA.join();
            System.out.println("ThreadB has finished execution after ThreadA.");
        } catch (InterruptedException e) {
            System.out.println("ThreadB was interrupted.");
        }
    }
}

public class ThreadJoinExample {
    public static void main(String[] args) {
        ThreadAA threadA = new ThreadAA();
        ThreadBB threadB = new ThreadBB(threadA);
        
        threadA.start();
        threadB.start();
    }
}
