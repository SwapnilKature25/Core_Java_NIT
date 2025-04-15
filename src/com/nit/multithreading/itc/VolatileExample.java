package com.nit.multithreading.itc;

class SharedData
{
    private volatile boolean flag = false;

    public void startThread()
    {
        Thread writer = new Thread(() ->
        {
            try
            {
                Thread.sleep(1000);  //Writer thread will go for 1 sec waiting state
                flag = true;
                System.out.println("Writer thread make the flag value as true");  // 1 
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        });

        Thread reader = new Thread(() ->
        {
            while (!flag)  //From cache memory still the value of flag is false
            {
               
            }
            System.out.println("Reader thread got the updated value");   // 2
        });

        writer.start();
        reader.start();
    }

}

public class VolatileExample
{    
    public static void main(String[] args)
    {
        new SharedData().startThread();
    }
}
