package dev.lpa;

public class Main {

    public static void main(String[] args) {

        var nationalUSParks = new Park[] {
                new Park("Yellowstone", "44.4882, -110.5916"),
                new Park("Grand Canyon", "36.0636, -112.1079"),
                new Park("Yosemite", "37.8855, -119.5360"),
        };

        Layer<Park> parkLayer = new Layer<>(nationalUSParks);
        parkLayer.renderLayer();
    }
}
