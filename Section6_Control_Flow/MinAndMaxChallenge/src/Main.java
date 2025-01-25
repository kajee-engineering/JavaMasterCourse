package Section6_Control_Flow.MinAndMaxChallenge.src;

import java.util.Scanner;

public class Main {

    // コンソールから入力を受け取り、最小値と最大値を出力する。
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int maxInt = 0;
        int minInt = 0;
        int loopCount = 0;

        while (true) {
            System.out.println("Enter a number, or any character to exit: ");
            String nextEntry = scanner.nextLine();

            try {
                int validNumber = Integer.parseInt(nextEntry);
                if (maxInt < validNumber) {
                    maxInt = validNumber;
                }
                if (minInt > validNumber) {
                    minInt = validNumber;
                }
                loopCount++;

            } catch (NumberFormatException nfe) {
                break;
            }
        }

        if (loopCount > 0) {
            System.out.println("min = " + minInt + " , max = " + maxInt);
        } else {
            System.out.println("No valid data");
        }
    }
}