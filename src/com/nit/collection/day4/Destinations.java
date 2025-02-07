package com.nit.collection.day4;

import java.util.ArrayList;
import java.util.List;

public class Destinations {
	private String name;
    private ArrayList<Activity> activities;

    public Destinations(String name) {
        this.name = name;
        this.activities = new ArrayList<>();
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public List<Activity> getActivities() {
        return activities;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Destination: " + name + "\n");
        for (Activity activity : activities) {
            sb.append(activity.toString()).append("\n");
        }
        return sb.toString();
    }
    
    
	
}


/* import java.util.ArrayList;
import java.util.List;

// Activity class
class Activity {
    private String name;
    private String schedule;

    public Activity(String name, String schedule) {
        this.name = name;
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public String getSchedule() {
        return schedule;
    }

    @Override
    public String toString() {
        return "- " + name + " (" + schedule + ")";
    }
}

// Destination class
class Destination {
    private String name;
    private List<Activity> activities;

    public Destination(String name) {
        this.name = name;
        this.activities = new ArrayList<>();
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public List<Activity> getActivities() {
        return activities;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Destination: " + name + "\n");
        for (Activity activity : activities) {
            sb.append(activity.toString()).append("\n");
        }
        return sb.toString();
    }
}

// ItineraryPlanner class
class ItineraryPlanner {
    private List<Destination> destinations;

    public ItineraryPlanner() {
        destinations = new ArrayList<>();
    }

    public void addDestination(Destination destination) {
        destinations.add(destination);
    }

    public List<Destination> getDestinations() {
        return destinations;
    }
}

// Main class
public class TravelItineraryPlanner {
    public static void main(String[] args) {
        ItineraryPlanner planner = new ItineraryPlanner();

        // Creating destinations
        Destination paris = new Destination("Paris");
        paris.addActivity(new Activity("Visit Eiffel Tower", "Morning"));
        paris.addActivity(new Activity("Louvre Museum", "Afternoon"));

        Destination london = new Destination("London");
        london.addActivity(new Activity("British Museum", "Morning"));
        london.addActivity(new Activity("London Eye", "Afternoon"));

        // Adding destinations to planner
        planner.addDestination(paris);
        planner.addDestination(london);

        // Displaying the itinerary
        for (Destination destination : planner.getDestinations()) {
            System.out.println(destination);
        }
    }
}
 */