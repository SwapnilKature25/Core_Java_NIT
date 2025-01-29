package com.nit.interfaces.day2;

//MobilePhoneInterface: Defines common methods for mobile phone operations
interface MobilePhoneInterface {
void insertSIM(SimCardInterface sim);
void removeSIM();
void makeCall(String number);
void sendText(String number, String message);
}

//MobilePhone Class Implementation
class MobilePhone implements MobilePhoneInterface {
private SimCardInterface simCard;

public void insertSIM(SimCardInterface sim) {
   if (simCard != null) {
       System.out.println("Removing existing SIM...");
       simCard.deactivate();
   }
   this.simCard = sim;
   simCard.activate();
   System.out.println("Inserted SIM: " + sim.getProvider() + " | Phone Number: " + sim.getPhoneNumber());
}

public void removeSIM() {
   if (simCard != null) {
       System.out.println("Removing SIM: " + simCard.getProvider());
       simCard.deactivate();
       simCard = null;
   } else {
       System.out.println("No SIM to remove.");
   }
}

public void makeCall(String number) {
   if (simCard != null) {
       System.out.println("Calling " + number + " using " + simCard.getProvider() + " SIM...");
   } else {
       System.out.println("No SIM inserted. Cannot make a call.");
   }
}

public void sendText(String number, String message) {
   if (simCard != null) {
       System.out.println("Sending message to " + number + " via " + simCard.getProvider() + " SIM: " + message);
   } else {
       System.out.println("No SIM inserted. Cannot send a message.");
   }
}
}

//Main class to test the implementation
public class MobilePhoneSimulation {
public static void main(String[] args) {
   // Creating different SIM cards
	SimCardInterface jioSim = new Jio("9876543210");
	SimCardInterface airtelSim = new Airtel("9123456789");
	SimCardInterface bsnlSim = new BSNL("9001122334");

   // Creating a mobile phone
   MobilePhone myPhone = new MobilePhone();

   // Insert a SIM and perform actions
   myPhone.insertSIM(jioSim);
   myPhone.makeCall("9998887777");
   myPhone.sendText("9998887777", "Hello!");

   // Remove SIM
   myPhone.removeSIM();

   // Insert another SIM
   myPhone.insertSIM(airtelSim);
   myPhone.makeCall("8887776665");

   // Remove and insert BSNL SIM
   myPhone.removeSIM();
   myPhone.insertSIM(bsnlSim);
   myPhone.sendText("7776665554", "Good morning!");

   // Finally, remove the SIM
   myPhone.removeSIM();
}
}


/*  Jio SIM activated.
Inserted SIM: Jio | Phone Number: 9876543210
Calling 9998887777 using Jio SIM...
Sending message to 9998887777 via Jio SIM: Hello!
Removing SIM: Jio
Jio SIM deactivated.
Airtel SIM activated.
Inserted SIM: Airtel | Phone Number: 9123456789
Calling 8887776665 using Airtel SIM...
Removing SIM: Airtel
Airtel SIM deactivated.
BSNL SIM activated.
Inserted SIM: BSNL | Phone Number: 9001122334
Sending message to 7776665554 via BSNL SIM: Good morning!
Removing SIM: BSNL
BSNL SIM deactivated.
 */