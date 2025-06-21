package dev.lpa;

enum FlightStages implements Trackable{

    GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION; // 全てFlightStages型として扱われる

    @Override
    public void track() { // abstractメソッドを実装しなければいけない

        if (this != GROUNDED) {
            System.out.println("Monitoring " + this);
        }
    }

    public FlightStages getNextStages() {

        FlightStages[] allStages = values();
        return allStages[(ordinal() + 1) % allStages.length];
    }
}

record DragonFly(String name, String type) implements FlightEnabled {

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

class Satellite implements OrbitEarth {

    FlightStages stage = FlightStages.GROUNDED;


    // OrbitEarthとOrbitEarthの継承元であるFlightEnabledのメソッドを実装する必要がある　

    public void achieveOrbit() {
        // System.out.println("Achieved orbit...!");
        transition("Orbit achieved!");
    };


    @Override
    public void takeOff() {

        transition("Taking Off");
    }

    @Override
    public void land() {

        transition("Landing");
    }

    @Override
    public void fly() {

        achieveOrbit();
        transition("Data Collection while Orbiting");

    }

    public void transition(String description) {

        System.out.println(description);
        stage = transition(stage);
        stage.track();
    }
}

interface OrbitEarth extends FlightEnabled {

   void achieveOrbit();

   private static void log(String description) {
       var today = new java.util.Date();
       System.out.println(today + ": " + description);
   }

    private void logStage(FlightStages stage, String description) {
       description = stage + ": " + description;
       log(description);
    }

    @Override
    default FlightStages transition(FlightStages stage) {
       FlightStages nextStages = FlightEnabled.super.transition(stage);
       logStage(stage, "Beginning Transaction to " + nextStages);
       return nextStages;
    }
}
interface FlightEnabled {

    // double MILE_TO_KM = 1.60934; の場合 public static final が暗黙的に宣言される
    double KM_TO_MILE = 0.62137;

    void takeOff(); // 暗黙的にpublic, abstractが宣言される
    void land();
    void fly();

    // FlightStages transition(FlightStages stage); // 全てのクラスを変更する必要がある
    default FlightStages transition(FlightStages stage) {
        // System.out.println("transition not implemented on " + getClass().getName());
        // return null;
        FlightStages nextStage = stage.getNextStages();
        System.out.println("Transitioning from " + stage + " to " + nextStage);
        return nextStage;
    }
}

// interfaceクラスは一般的に末尾にableを付与する
interface Trackable { // 暗黙的にabstractを宣言する

    void track(); // ボディを持つことはできない
}

public abstract class Animal {

    public abstract void move() ; // ボディを持つことはできない
}
