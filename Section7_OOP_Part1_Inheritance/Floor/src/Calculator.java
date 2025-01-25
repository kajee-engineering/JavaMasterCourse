package Section7_OOP_Part1_Inheritance.Floor.src;

public class Calculator {

    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
       return carpet.getCost() * floor.getArea();
    }
}
