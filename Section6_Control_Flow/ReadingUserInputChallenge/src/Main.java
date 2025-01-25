package Section6_Control_Flow.ReadingUserInputChallenge.src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(getSumFromUserInput());
    }

    public static String getSumFromUserInput() {

        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int  counter = 1;

        while ( counter <= 5) {
            System.out.println("Enter number #" + counter + ": ");
            String n = scanner.nextLine();
            try {
                sum += Double.parseDouble(n);
                counter ++;
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters not allowed");
            }
        }

        return "Five Number Sum is : " + sum;
    }
}