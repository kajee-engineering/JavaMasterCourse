package Section6_Control_Flow.InputCalculator.src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        long average = 0;
        int count = 1;

        while (true) {
            try {
                int validNumber = Integer.parseInt(scanner.nextLine());
                sum +=  validNumber;
                average = Math.round((double) sum / count);

            } catch (NumberFormatException nfe) {
                break;
            }
            count++;
        }
    System.out.println("SUM = " + sum + " AVG = " + average);
    }
}