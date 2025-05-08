package com.nit.collection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class InternalWorkingCopyOnWriteArrList {

    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<String> cities = new CopyOnWriteArrayList<>();
        cities.add("A");
        cities.add("B");
        cities.add("C");

        // Create iterator (snapshot is taken here)
        Iterator<String> itr = cities.iterator();

        // Modify the list AFTER iterator is created
        cities.add("D");

        System.out.println("Iterating using snapshot:");
        while (itr.hasNext()) {
            System.out.println(itr.next());  // Will print only A, B, C
        }

        System.out.println("Current list:");
        for (String city : cities) {
            System.out.println(city);  // Will print A, B, C, D
        }
    }
}
