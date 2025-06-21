package dev.lpa;

public class Bird extends // javaは継承をextendsで表現する
        Animal // 単一クラスのみ継承できる
        implements FlightEnabled, Trackable { // 複数のインターフェースを実装できる。単一継承の制約を補うことができる。

    // なぜAnimalクラスやサブクラスに全てのメソッドを定義しないか??
    // Animalクラスのオブジェクトは全てFlightEnableでない、かつ、全てをtrackしたいわけではない

    @Override
    public void move() {
        System.out.println("Flaps wings");
    }

    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName() + " is taking off");

    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " is landing");

    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " is flying");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s coordinates recorded");

    }
}
