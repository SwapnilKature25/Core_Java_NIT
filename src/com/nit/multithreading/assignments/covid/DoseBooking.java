package com.nit.multithreading.assignments.covid;

class DoseBooking {
    private boolean booked = false;

    public synchronized void bookDose() {
        if (booked) {
            throw new RuntimeException("Dose already booked.");
        }
        booked = true;
        System.out.println("Dose booked successfully.");
    }

    public boolean isDoseBooked() {
        return booked;
    }
}
