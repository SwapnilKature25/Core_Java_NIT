package com.nit.collection.day4;

public class TravelItineraryPlanner {
    public static void main(String[] args) {
        ItineraryPlanner planner = new ItineraryPlanner();

        // Creating destinations
        Destinations paris = new Destinations("Paris");
        paris.addActivity(new Activity("Visit Eiffel Tower", "Morning"));
        paris.addActivity(new Activity("Louvre Museum", "Afternoon"));

        Destinations london = new Destinations("London");
        london.addActivity(new Activity("British Museum", "Morning"));
        london.addActivity(new Activity("London Eye", "Afternoon"));

        // Adding destinations to planner
        planner.addDestination(paris);
        planner.addDestination(london);

        // Displaying the itinerary
        for (Destinations destination : planner.getDestinations()) {
            System.out.println(destination);
        }
    }
}