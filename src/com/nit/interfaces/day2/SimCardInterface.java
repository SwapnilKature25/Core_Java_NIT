package com.nit.interfaces.day2;


//SIMCardInterface: Defines common methods for all SIM cards


interface SimCardInterface {
 String getPhoneNumber();
 String getProvider();
 void activate();
 void deactivate();
}

//Jio SIM Implementation
class Jio implements SimCardInterface {
 private String phoneNumber;

 public Jio(String phoneNumber) {
     this.phoneNumber = phoneNumber;
 }

 public String getPhoneNumber() {
     return phoneNumber;
 }

 public String getProvider() {
     return "Jio";
 }

 public void activate() {
     System.out.println("Jio SIM activated.");
 }

 public void deactivate() {
     System.out.println("Jio SIM deactivated.");
 }
}

//Airtel SIM Implementation
class Airtel implements SimCardInterface {
 private String phoneNumber;

 public Airtel(String phoneNumber) {
     this.phoneNumber = phoneNumber;
 }

 public String getPhoneNumber() {
     return phoneNumber;
 }

 public String getProvider() {
     return "Airtel";
 }

 public void activate() {
     System.out.println("Airtel SIM activated.");
 }

 public void deactivate() {
     System.out.println("Airtel SIM deactivated.");
 }
}

//BSNL SIM Implementation
class BSNL implements SimCardInterface {
 private String phoneNumber;

 public BSNL(String phoneNumber) {
     this.phoneNumber = phoneNumber;
 }

 public String getPhoneNumber() {
     return phoneNumber;
 }

 public String getProvider() {
     return "BSNL";
 }

 public void activate() {
     System.out.println("BSNL SIM activated.");
 }

 public void deactivate() {
     System.out.println("BSNL SIM deactivated.");
 }
}

