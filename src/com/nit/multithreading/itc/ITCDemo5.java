package com.nit.multithreading.itc;

//Program to show how to cancel and book the ticket on the same TicketSystem  object


class TicketSystem 
{
  private int availableTickets = 5;   //availableTickets = 5
  
  public synchronized void bookTicket(int numberOfTickets) //numberOfTickets = 2, 4
  {
      while (availableTickets < numberOfTickets) // 5  <  2  , 4<4
      {
         System.out.println("Not enough tickets available, Waiting for cancellation...");
          try 
          {
              wait(); 
          }
          catch (InterruptedException e) 
          {
              e.printStackTrace();
          }
      }
      availableTickets = availableTickets - numberOfTickets;  //5 - 2, 4-4 = 0
      
      System.out.println("Booked " + numberOfTickets + " ticket(s). Remaining tickets: " + availableTickets);  // 3  0
      notify(); 
            
  }

  
public synchronized void cancelTicket(int numberOfTickets)//numberOfTickets = 1
  {
      availableTickets = availableTickets + numberOfTickets;  // 3+1 = 4
      System.out.println("Canceled " + numberOfTickets + " ticket(s). Available tickets: " + availableTickets);
      notify(); 
  }
}


public class ITCDemo5 
{
  public static void main(String[] args) 
  {
      TicketSystem ticketSystem = new TicketSystem(); //lock is available

      Thread bookingThread = new Thread()
      {
      	@Override
          public void run() 
      	{
              int[] ticketsToBook = {2, 4, 4};  
              
              for (int ticket : ticketsToBook) //ticket = 4
              {
                  ticketSystem.bookTicket(ticket);
                  try 
                  {
                      Thread.sleep(1000); // give some time b/w booking
                  } 
                  catch (InterruptedException e)
                  {
                      e.printStackTrace();
                  }
              }
      	 }        	
      };
      bookingThread.start();
      
      Thread cancellationThread = new Thread()
     	{
      	@Override
          public void run() 
      	{
              int[] ticketsToCancel = {1, 3, 2};
              
              for (int ticket : ticketsToCancel) //ticket = 1
              {
                  ticketSystem.cancelTicket(ticket);
                  try 
                  {
                      Thread.sleep(1500);  // give some time b/w cancellation
                  } 
                  catch (InterruptedException e) 
                  {
                      e.printStackTrace();
                  }
              }
          }
      };
      cancellationThread.start();
      
      
      
      
  }
}


/* Booked 2 ticket(s). Remaining tickets: 3
Canceled 1 ticket(s). Available tickets: 4
Booked 4 ticket(s). Remaining tickets: 0
Canceled 3 ticket(s). Available tickets: 3
Not enough tickets available, Waiting for cancellation...
Canceled 2 ticket(s). Available tickets: 5
Booked 4 ticket(s). Remaining tickets: 1
 */