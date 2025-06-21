package dev.lpa;

public class Test {

    public static void main(String[] args) {
        inFlighted(new Jet());

        // OrbitEarth.log("Testing " + new Satellite());
        orbit(new Satellite());

    }

    public static void inFlighted(FlightEnabled flier) {

        flier.takeOff();
        flier.transition(FlightStages.LAUNCH);
        flier.fly();

        if (flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
    }

    public static void orbit(OrbitEarth flier) {

        flier.takeOff();
        flier.fly();
        flier.land();
    }

}
