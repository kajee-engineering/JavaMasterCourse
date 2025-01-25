package Section7_OOP_Part1_Inheritance.AreaCalculator.src;

public class Main {
    public static void main(String[] args) {
        System.out.println(area(-1));
        System.out.println(area(3));
        System.out.println(area(-1, 0));
        System.out.println(area(0, -1));
        System.out.println(area(5, 4));
        System.out.println(area(5.0));
        System.out.println(area(5.0, 4.0));
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }

        return radius * radius * 3.141592;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        }

        return x * y;
    }

}