package dev.lpa;

public class Bird implements  FlightEnabled {

    public Bird() {
    }

    public static void main(String[] args) {
        FlightEnabled flier = new Bird();
    }
}

