package com.nit.collection.queue;

//Note : For Custom object we are using Comparator interface.

import java.util.Comparator;
import java.util.PriorityQueue;

record Task(String name, Integer priority)
{
}


public class PriorityQueueDemo3 {
    public static void main(String[] args) 
    {                                               
        PriorityQueue<Task> taskQueue = new PriorityQueue<>((t1, t2)->t1.priority().compareTo(t2.priority()));

        taskQueue.add(new Task("Submit report", 4));
        taskQueue.add(new Task("Find Bug", 2));
        taskQueue.add(new Task("Write Program", 1));
        taskQueue.add(new Task("Execute Program", 3));

        while (!taskQueue.isEmpty()) 
        {
            System.out.println("Executing: " + taskQueue.poll());
        }
    }
}

/* Executing: Task[name=Write Program, priority=1]
Executing: Task[name=Find Bug, priority=2]
Executing: Task[name=Execute Program, priority=3]
Executing: Task[name=Submit report, priority=4]
 */
