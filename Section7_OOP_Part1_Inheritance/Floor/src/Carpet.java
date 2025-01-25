package Section7_OOP_Part1_Inheritance.Floor.src;

public class Carpet {

    private double cost;

    public Carpet(double cost) {
        this.cost = cost < 0 ? 0 : cost;
    }

    public double getCost() {
        return cost;
    }
}
