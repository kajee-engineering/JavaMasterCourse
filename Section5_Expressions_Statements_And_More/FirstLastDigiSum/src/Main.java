package Section5_Expressions_Statements_And_More.FirstLastDigiSum.src;

public class Main {

    public static void main(String[] args) {

        System.out.println( sumFirstAndLastDigit(252) );
        System.out.println( sumFirstAndLastDigit(257) );
        System.out.println( sumFirstAndLastDigit(0) );
        System.out.println( sumFirstAndLastDigit(5) );
        System.out.println( sumFirstAndLastDigit(-10) );
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10; // 2
        int firstNumber = number;

        // 252 -> 25 -> 2
        while (firstNumber >  9) {
           firstNumber /= 10;
        }

        return lastDigit + firstNumber;
    }
}