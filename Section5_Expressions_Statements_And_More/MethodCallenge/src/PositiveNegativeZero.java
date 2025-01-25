package Section5_Expressions_Statements_And_More.MethodCallenge.src;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (0 == number) {
            System.out.println("zero");
        } else {
            System.out.println("negative");
        }
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        return (kilometersPerHour < 0) ? -1 : (int) Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }


}
