package Section7_OOP_Part1_Inheritance.OverloadChallenge.src;

public class Main {

    public static void main(String[] args) {
        System.out.println("5fh, 8in = " + convertToCentimeters(5, 8) + "cm");
        System.out.println("68in  = " + convertToCentimeters(68) + "cm");

    }

    public static double convertToCentimeters(int inches) { // 同じ関数名が複数存在する。違いは引数）

        return inches * 2.54;
    }
    public static double convertToCentimeters(int feet, int inches) {

        // return ((feet * 12) + inches) * 2.54;
        // return convertToCentimeters((feet * 12) + inches);
        int feetToInches = feet * 12;
        int totalInches = feetToInches + inches;
        double result = convertToCentimeters(totalInches);
        return result;
    }
}