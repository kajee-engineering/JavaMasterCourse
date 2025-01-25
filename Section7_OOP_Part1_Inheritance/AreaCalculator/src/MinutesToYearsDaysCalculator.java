package Section7_OOP_Part1_Inheritance.AreaCalculator.src;

public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600); // 1y and 0 d
        printYearsAndDays(561600); // 1y and 25 d
    }

    public  static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return ;
        }

        long years = minutes / (60*24*365);
        long days = (minutes - (years * (60*24*365))) / (60*24);

        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }
}
