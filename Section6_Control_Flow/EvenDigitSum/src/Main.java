package Section6_Control_Flow.EvenDigitSum.src;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                getEvenDigitSum(123456789) // 2 + 4 + 6 + 8 = 20
        );
        System.out.println(
                getEvenDigitSum(252) // 2 + 2 = 4
        );
        System.out.println(
                getEvenDigitSum(-22) // -1
        );

    }
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int total = 0;
        while (number > 0) { // 252, 25, 2
            int digit = number % 10; // 2,  5, 2
            if (digit % 2 == 0) {
                total += digit; // 2, 0 , 2
            }

            number /= 10;
        }

        return total;
    }
}