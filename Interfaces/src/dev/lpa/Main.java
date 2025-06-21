package dev.lpa;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Bird bird = new Bird();
        // inFlighted(bird);
        // Animal animal = bird;
        // FlightEnabled flier = bird;
        // Trackable tracked = bird;

        // bird.move();
        // bird.takeOff();
        // bird.land();
        // bird.fly();
        // bird.takeOff();
        // flier.move();
        // tracked.move();
        // animal.move();

        // inFlighted(flier);
        // inFlighted(new Jet());

        // Trackable track = new Truck();
        // track.track();

        // double kmsTraveled = 100;
        // double milesTraveled = kmsTraveled * FlightEnabled.KM_TO_MILE;
        // System.out.printf("The truck traveled %.2f km or %.2f miles%n", kmsTraveled, milesTraveled);

        // ArrayList<FlightEnabled> fliers = new ArrayList<>();
        // fliers.add(bird);

        // triggerFliers(fliers);
        // flyFliers(fliers);
        // landFliers(fliers);

    }

    public static void inFlighted(FlightEnabled flier) {

        flier.takeOff();
        flier.fly();

        if (flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
    }

    private static void triggerFliers(ArrayList<FlightEnabled> fliers) {

        for (var flier : fliers) {
            flier.takeOff();
        }
    }

    private static void flyFliers(ArrayList<FlightEnabled> fliers) {

        for (var flier : fliers) {
            flier.fly();
        }
    }

    private static void landFliers(ArrayList<FlightEnabled> fliers) {

        for (var flier : fliers) {
            flier.land();
        }
    }

}
