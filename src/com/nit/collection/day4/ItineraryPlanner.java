package com.nit.collection.day4;

import java.util.ArrayList;
import java.util.List;

public class ItineraryPlanner {
    private List<Destinations> destinations;

    public ItineraryPlanner() {
        destinations = new ArrayList<>();
    }

    public void addDestination(Destinations destination) {
        destinations.add(destination);
    }

    public List<Destinations> getDestinations() {
        return destinations;
    }
}