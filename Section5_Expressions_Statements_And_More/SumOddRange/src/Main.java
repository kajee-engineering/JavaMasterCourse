package Section5_Expressions_Statements_And_More.SumOddRange.src;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
        System.out.println(sumOdd(10, 5));
    }

    public static boolean isOdd(int number) {
        if (! (0 < number)) {
            return false;
        }

        return number % 2 != 0;
    }

    public static int sumOdd(int start,  int end) {
        int sum = 0;

        if (start < 0 || end < 0 || end < start) {
            return -1;
        }

        for (int i = start; start <= end; start++) {
            if (isOdd(start)) {
               sum += start;
            }
        }
        return sum;
    }
}