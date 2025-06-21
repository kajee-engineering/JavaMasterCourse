package dev.lpa;

import java.util.Arrays;

public interface Mappable {

    void render();

    static double[] stringToLatLon(String location) { // "34.743058918417994, 135.3279403380836"
        var splits = location.split(",");
        double lat = Double.valueOf(splits[0]);
        double lan = Double.valueOf(splits[1]);
        return new double[]{lat, lan}; // [34.743058918417994, 135.3279403380836]
    }
}

// render()を実装しなくてもエラーにならない
// ここで実装しない場合、具象クラスで実装する必要がある
// 実際にはrender()を実装したいのでこのクラスでオーバーライドする
abstract class Point implements Mappable {

    private double[] location = new double[2]; // [緯度, 経度]

    public Point(String location) {
        this.location = Mappable.stringToLatLon(location);
    }

    @Override
    public void render() {
        System.out.println(
                "Render " + this + " as POINT (" + location() + ")"
        );
    }

    private String location() {
        return Arrays.toString(location);
    }
}

abstract class Line implements Mappable {

    private double[][] locations;

    public Line(String... locations) { // ... 可変長引数。メソッドに渡す引数の数が決まっていない場合に使う
        this.locations = new double[locations.length][]; // locations.length個のdouble型の配列を格納できる配列
        int index = 0;
        for (var l : locations) {
            this.locations[index++] = Mappable.stringToLatLon(l);
        }
    }

    @Override
    public void render() {
        System.out.println(
                "Render " + this + " as LINE (" + locations() + ")"
        );
    }

    private String locations() {
        return Arrays.deepToString(locations);
    }
}