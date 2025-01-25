package Section6_Control_Flow.SharedDigit.src;

public class Main {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int number1, int number2) {

        if ( (! (10 <= number1 && number1 <= 99) || ! (10 <= number2 && number2 <= 99))) {
            return false;
        }

        return (number1 / 10 ==  number2 / 10) || (number1 / 10 ==  number2 % 10) || (number1 % 10 ==  number2 / 10) || (number1 % 10 ==  number2 % 10);
    }
}